import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class ThreadTest {
	public static void main(String[] args){
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
				5, 10, 200, TimeUnit.MILLISECONDS, 
				new ArrayBlockingQueue<Runnable>(6));
		
		for (int i = 0; i < 15; i++) {
			MyTask myTask = new MyTask(i);
			threadPoolExecutor.execute(myTask);
			System.out.println("当前线程："+Thread.currentThread().getId()+"线程池中线程数："+threadPoolExecutor.getPoolSize()+
					"线程中等待执行的任务数目:"+threadPoolExecutor.getQueue().size()+
					"已执行完的任务数目:"+threadPoolExecutor.getCompletedTaskCount());
		}
		
		threadPoolExecutor.shutdown();
	}
}

class MyTask implements Runnable{
	private int taskNum;
	public MyTask(int num){
		this.taskNum = num;
	}
	
	public  void run() {
		
		// TODO Auto-generated method stub
		System.out.println("正在执行task:"+taskNum);
		try {
			Thread.currentThread().sleep(4000);		
		} catch (Exception e) {
			// TODO: handle exceptio
			e.printStackTrace();
		}
		
		System.out.println(taskNum+"执行完毕");
	}
}
