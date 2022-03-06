
public class Fluxo {
	
	 public static void main(String[] args) {
	        System.out.println("Ini do main");
	     
	        try {
	        	
	        	metodo1();    	
	        	
	        } catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
                String msg = ex.getMessage();
	        	System.out.print ("Exception" + msg);
	        	ex.printStackTrace();
	        	
	        } 
	        System.out.println("Fim do main");
	    }

	    private static void metodo1() throws MinhaExcecao {
            System.out.println("Ini do metodo1");

	        metodo2();
	        System.out.println("Fim do metodo1");
	    
	    }

	    private static void metodo2() throws MinhaExcecao {
            System.out.println("Ini do metodo2");
	       
			throw new MinhaExcecao("Deu muito ERRADO!");

	        //System.out.println("Fim do metodo2");
	    }

		
}

/* 

* Na categoria Unchecked, o compilador não dá muita importância. Se dermos throws ou não, ele 
* não toma atitude, ou seja, ele não verifica — unchecked (não verificado pelo compilador).
* Já a categoria Checked é verificada pelo compilador. No metodo2(), somos obrigados a colocar 
* throws na assinatura do método, pois a exceção do tipo MinhaExcecao estende diretamente de 
* Exception e, por isso, é verificada pelo compilador.

* Legal! Mas repare que a chamada do metodo2(), no metodo1(), não compila mais. Agora, isso acontece 
* porque o compilador detecta que existe uma exceção checked na assinatura e, por isso, é necessário 
* também deixar explícito o throws MinhaExcecao na assinatura do metodo1(). 

* Podemos colocar throws no método ou transferir a exceção para a categoria unchecked. Repare que 
* colocamos throws nos dois métodos, mas não o colocamos em main() e, mesmo assim, o código compilou. 
* Isso aconteceu porque estamos fazendo um tratamento da exceção com o try-catch. Ou seja, temos duas 
* formas de resolver uma exceção checked.

* Assim, o compilador não se manifestou, pois estamos resolvendo o problema da exceção. Se estamos 
* resolvendo, não é necessário colocar o throws na assinatura do método. Considerando que foi só um exemplo, 
* vamos deixar como estava, pois já temos um try-catch em main().
* 
* O conceito de exceções existe em várias linguagens, mas o que acabamos de estudar — checked e o unchecked — 
* é algo específico do mundo Java.
* 
* Entendemos que todas as categorias são exceções, são como bombas que caem na pilha e mudam o fluxo na hora 
* da execução, mas a diferença entre eles é na hora de compilar. O Checked e o Unchecked estão relacionados 
* ao processo de compilação.

*/