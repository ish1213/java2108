package com.example.chapter02;

public class Variable4_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char myChar = 'A';     // �옉���뵲�샂�몴濡� 臾띠씤 寃껋� 臾몄옄
		String yourStr = "Apple"; // �겙�뵲�샂�몴濡� 臾띠씤 寃껋� 臾몄옄�뿴...
		
		System.out.println(myChar);// char A瑜� 異쒕젰
		System.out.println(yourStr);// string A瑜� 異쒕젰
		
		// char ���엯 蹂��닔�뒗 ascii 濡� 異쒕젰�븷 �닔 �엳�떎.
		System.out.println((int)myChar);  // 65
		
		int newChar = 66;
		// ascii 肄붾뱶媛믪쓣 臾몄옄濡� 異쒕젰�븷 �닔 �엳�떎.
		System.out.println((char)newChar); // B
		
		// �쁺�뼱�븣�뙆踰� A ~ Z源뚯�瑜� �븘�뒪�궎肄붾뱶瑜� �씠�슜 異쒕젰
		for(int ch = 65; ch < 91;ch++) {
			System.out.println((char)ch);
		}
		
		char ch1 = '한';
	    char ch2 = '\uD55C';
	    
	    System.out.println(ch1);
	    System.out.println(ch2);

	}

}
