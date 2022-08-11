package InversaodeControle;

public class ClasseA{

    private ClasseB classeB;

    // injeção de dependencia pelo construtor
    public ClasseA(ClasseB classeB) {
        this.classeB = classeB;
    
    }




    public void metodoA(){
       
        System.out.println("Usando Método de B: /n " +  classeB.metodoB());
    }
}