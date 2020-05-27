/*
 * 연산표기법
 * 1. 전위 : a+(b*c) => 괄호를 이용하여 감싼다.(a+(b*c)) => 연산자를 먼저쓰고 피연산자를 뒤에 쓴다.+(a*(bc)) => 
 *          괄호를 벗겨준다.+a*bc
 * 2. 중위 : a+(b*c)
 * 3. 후위 : a+(b*c) => 괄호를 이용하여 감싼다.(a+(b*c)) => 피연산자를 먼저 쓰고 연산자를 맨 뒤에 쓴다.(a(bc)*+) => 
 *          괄호를 벗겨준다.abc*+
 *          
 * a b  +  c d - * : 중위표기법으로 전환 => (a+b) * (c-d) 
 * 괄호를 이용하여 감싸준다.((ab)+(cb-)*) => ((a+b)*(c-b)) => 
 * 연산자를 이용하여 피연산자 사이로 이동 시켜준다.((a+b)*(c-b)) => (a+b)*(c-b)
 * 
 * (a+b) * (c-d) 다시 후위표기법으로
 * 괄호를 이용하여 감싸준다.((a+b)*(c-b)) => ((ab+)(cb-)*) =>
 * 피연산자를 연산자 뒤로 이동 시켜준다.(ab+)(cb-)* => ab+cd-*
 * 
 * a + b * c - d 후위표기법으로 변환
 * a+(b*c)-d => (a+(b*C)-d) => (a(bc)*)+-d => ((a(bc)*+d)- => abc*+d-  
 */
public class TXT {

	public static void main(String[] args) {
		

	}

}
