
package contabancaria;



public class Conta {
    private long account;
    private double saldo;
    private String nome;

    public Conta(String nome, double initialValue, long account) {
        this.account = account;
        depositar(initialValue);
        this.nome = nome;
    }
    
    
    public void depositar(double valor){
        System.out.println("Uppdate Account data:");
        this.saldo += valor;
    }
    
    public void sacar(double valor){
        System.out.println("Uppdate Account data:");
        double taxa = 5.00;
        
        this.saldo += - valor - taxa;
       
    } 
    
    
    public double balance(){
        
        return this.getSaldo();
    }

    @Override
    public String toString() {
        return "Account = " 
                + account
                + ", Holder = " + nome
                + String.format(", Balance = $ %.2f\n" , balance()) ;
    }
    
    
    
    public double getSaldo() {
        return saldo;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAccount() {
        return account;
    }

    

    

   
    
    
   
}
