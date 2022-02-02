import model.Cliente;
import model.Conta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {
    public static void main(String[] args) {
        /* Primeira execução com inserção no banco de dados

        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        cliente1.setNome("Arthur");
        cliente1.setCpf("01234567891");
        cliente1.setEmail("arthur@arthur.com");
        cliente1.setTelefone("021 00000-0000");

        cliente2.setNome("Kimberly");
        cliente2.setCpf("01234567892");
        cliente2.setEmail("kimberly@arthur.com");
        cliente2.setTelefone("021 00000-0000");

        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        conta1.setCliente(cliente1);
        conta1.setIdConta(1);
        conta1.setSaldo(900);
        conta1.setSenha("ArthurS2Kimberly");

        conta2.setCliente(cliente2);
        conta2.setIdConta(2);
        conta2.setSaldo(900);
        conta2.setSenha("KimberlyS2Arthur");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("javajpa");
        EntityManager em = emf.createEntityManager();

        // Inicia transação com banco de dados(Que não seja leitura)
        em.getTransaction().begin();

        em.persist(cliente1);
        em.persist(cliente2);

        em.persist(conta1);
        em.persist(conta2);

        em.getTransaction().commit();
        em.close();
        emf.close();
        System.out.println("Feito!");

         */



    }
}
