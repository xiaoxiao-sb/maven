package com.atguigu.maven;

public class MakeFriends {
	
	public String makeFriends(String name){
		HelloFriend friend = new HelloFriend();
		friend.sayHelloToFriend("litingwei");
		String str = "Hey,"+friend.getMyName()+" make a friend please.";
		System.out.println(str);
		return str;
	}

}
