package singleton;

/**  
 * 
 *
 * @author wujunjun 
 * @date 2015-3-26 下午4:39:47
 * @since 1.0  
 * @Copyright 2014 东莞市邮政局All rights reserved.  
 */
public class Singleton {
	
	private static Singleton singleton;
	
	//私有化构造方法
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(singleton==null){
			singleton = new Singleton();
		}
		return singleton;
	}

}
