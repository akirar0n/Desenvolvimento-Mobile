package controle;

public class ContaCorrente {
    private int saldo;
    private int chequeEspecial;

    public int getSaldo(){
        return saldo;
    }

    public int chequeEspecial(){
        return chequeEspecial;
    }

    public void sacar(int valor) throws Exception{
        if(valor<=0)
            throw new Exception ("Não podemos sacar um valor negativo ou zero! Valor:" + valor);
        else if(valor>(saldo + chequeEspecial))
            throw new Exception ("Operacao negada! O cliente não tem saldo suficiente! Saldo atual:" + (saldo + chequeEspecial));
        else
            saldo-=valor;
    }
 
    public void depositar(int newValor) throws Exception{
        saldo+= newValor;
    }
    
//    public void transferir()
       
}

