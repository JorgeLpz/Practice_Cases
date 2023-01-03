import java.util.Stack;

/*
Algorithm:
parenthesis checker.

1. First tranverse the String
2. Add the char into the Stack
3. Verify if the Stack has the open of "(,{,[" to pop it.
4. If the Stack is empty, this means that is balanced.

Geeks for Geeks EASY.

Fail: {}{(}))}
 */
public class Main {
    public static void main(String[] args) {
        String strPar = "{}{(}}";
        ispar(strPar);
        System.out.println(ispar(strPar));
    }

    static Boolean ispar(String x){
        String strPar = x;
        Boolean balanced = false;
        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < strPar.length(); i++){
            //Revisar si el character abre, si es asi agregarlo al stack.
            if(strPar.charAt(i) == '{' || strPar.charAt(i) == '(' || strPar.charAt(i) == '['){
                st.push(strPar.charAt(i));
            }else if (!st.empty()){
                    if((strPar.charAt(i) == '}' && st.peek() == '{') ||  //Si cierra y el top del stack cierra entonces relizar pop
                    (strPar.charAt(i) == ')' && st.peek() == '(') ||  // peek() me trae el objeto hasta arriba del stack, sin eliminar
                    (strPar.charAt(i) == ']' && st.peek() == '[')) {
                        //Entonces hace par y eliminamos pop()
                        st.pop();
                    }
            }else { // Agregamos parentesis que cierra.
                st.push(strPar.charAt(i));
            }
        }

        for(Character ch : st ){
            System.out.println(ch);
        }


        if(st.empty()){
            balanced = true;
        }

        return balanced;
    }

}