import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;


public class testException {
	 public static void main(String args[]){
		 try{
		 PrintWriter printWriter = 
				 new PrintWriter(new FileWriter(new File("input.txt")),true);
		 Random random = new Random();
		 
		 for (int i = 0; i < 10000; i++) {
			 printWriter.write(Math.abs(random.nextInt())%100+" ");
		 }
		 
		 printWriter.flush();
		 printWriter.close();
		 
		 BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
		 String str = bufferedReader.readLine();
		 bufferedReader.close();
		 
		 String[] strs = str.split(" ");
		 int count = 0;
		 for (int i = 0; i < 5; i++) {
			 int[] readcords = new int[2000];
			 for (int j = 0; j < readcords.length; j++) {
				readcords[j]= Integer.parseInt(strs[count]);
				count++;
			 }
			 PrintWriter pw = new PrintWriter(new FileWriter(new File("output.txt")) );
			 ThreadGroup group = new ThreadGroup(readcords, pw);
			 new Thread(group).start();
			 new Thread(group).start();
		 }
		 
		 
		 }catch(IOException e){
			 e.printStackTrace();
		 }
	}
	 
	
	 
	 
}

class ThreadGroup implements Runnable{
	private static int count = 0;
	private static Object lockObject = new Object();
	public static final int EVEN = 0;
	public static final int ODD = -1;
	
	private int type;
	private int records[];
	private PrintWriter writer;
	private int oddPoint = 0;
	private int evenPoint = 0;
	
	public ThreadGroup(int[] records, PrintWriter writer){
		this.records = records;
		this.writer = writer;
		this.type = EVEN;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		print();
	}
	
	private synchronized boolean print(){
		for (int i = 0; i < 10;) {
			if (oddPoint >= records.length && evenPoint>= records.length) {
				notifyAll();
				return false;
			}
			
			if ( (oddPoint >= records.length && type == ODD) || (evenPoint >= records.length && type == EVEN) ){
				break;
			}
			
			if(type == EVEN){
				if (records[evenPoint] % 2 == 0) {
					i++;
					writer.print(records[evenPoint]+" ");
					//System.out.println(records[evenPoint]+" ");
					writer.flush();
					synchronized (lockObject) {
						count ++ ;
						if (count % 1000 == 0) {
							System.out.println("当前完成数量:"+count);
							if (count % 10000 == 0) {
								System.out.println("Done");
							}
						}
					}
					
				}
				evenPoint++;
			}else{
				if (records[oddPoint] % 2 == 1) {
					i++;
					writer.write(records[oddPoint]+" ");
					writer.flush();
					synchronized (lockObject) {
						count++;
						if (count % 1000 == 0) {
							System.out.println("当前完成量:"+count);
							if (count % 10000 == 0) {
								System.out.println("Done");
							}
						}
					}
				}
				oddPoint++;
			}
			
			
			
		}
		type = ~type;
		notifyAll();
		
		try{
			wait();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		return true;
	}
}


