package Setgetter;

import java.util.Scanner;

/*
 * 제품번호(code), 제품이름(name), 제품색상(color),제품수량(su)이 존재합니다.
 * setter 이용하여 데이터를 저장하고,
 * getter 이용하여 데이터를 출력하세요.
 */
class Product {
	private String code;
	private String name;
	private String color;
	private int su;
	private int price;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		this.su = su;
	}
	public int Operation(){
		int sum = su*price;
		return sum;
		}
}
public class SetterSample1_Product {

	public static void main(String[] args) {
		String code, name, color;
		int su, price;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("제품 번호를 입력해 주세요.");
		code = sc.next();
		System.out.println("제품 이름을 입력해 주세요.");
		name = sc.next();
		System.out.println("제품 색상을 입력해 주세요.");
		color = sc.next();
		System.out.println("제품 수량을 입력해 주세요.");
		su = sc.nextInt();
		System.out.println("제품 단가을 입력해 주세요.");
		price = sc.nextInt();
		
		Product pd = new Product();
		//Data input
		pd.setCode(code);
		pd.setName(name);
		pd.setColor(color);
		pd.setSu(su);
		pd.setPrice(price);
		
		
		
		//Data output
		System.out.println("제품번호 : " + pd.getCode());
		System.out.println("제품이름 : " + pd.getName());
		System.out.println("제품색상 : " + pd.getColor());
		System.out.println("판매수익 : " + pd.Operation());

	}

}
