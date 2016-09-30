package com.feng;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Custom{
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "customer.xml" });
		DemoService demoService=(DemoService)context.getBean("demoService");
		String xx=null;
		
		try{
		 xx=demoService.sayHello("feng");
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(xx);
		 context.start();
		 System.in.read();
	}}
	
//	public static void main(String[] args) throws InterruptedException {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//				new String[] { "customer.xml" });
//		final DemoService demoService = (DemoService)context.getBean("demoService"); //
//    	ExecutorService executorServicePool = Executors.newFixedThreadPool(200);
//    	final int size = 100000;
//    	final CountDownLatch cdl = new CountDownLatch(size);
//    	long begin = System.currentTimeMillis();
//		for (int i = 0; i < size; i++) {
//			executorServicePool.execute(new Runnable() {
//				public void run() {
//					try {
//						String hello = demoService.sayHello("lcx"); 
//						System.out.println(hello);
//				        cdl.countDown();
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//				}
//			});
//		}
//		cdl.await();//等待所有任务处理完
//		executorServicePool.shutdown(); //关闭线程
//        long time = System.currentTimeMillis() - begin;
//        System.out.println("耗时：" + (double) time / 1000 + " s");
//        System.out.println("平均:" + ((double) time) / size +" ms");
//        System.out.println("TPS:" + (double) size / ((double) time / 1000));              
//    }
//}




