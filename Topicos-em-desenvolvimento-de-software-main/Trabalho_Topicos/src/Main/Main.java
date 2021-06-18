package Main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import javaapplication1.Aluno;
import javaapplication1.Curso;
import javaapplication1.Departamento;
import javaapplication1.Disciplina;
import javaapplication1.Historico;
/** 
 *
 * @author Maria Eduarda e Lorena Eduarda
 */

//Saulo, encontramos muitos problemas ao fazer esse trabalho, infelizmente não conseguimos por completo. Mas tentamos fazer nosso melhor! //
//Ano passado foi um ano muito complicado, pois enfrentamos um ensino remoto(o qual foi uma experiência nova e traumática para todos) e 
//não aprendemos muito da matéria com a professora de Programação//

public class Main { //scanners e arraylists utilizados no código
    
    static Scanner palavras = new Scanner(System.in); //ler string
    static Scanner numeros = new Scanner(System.in); //ler int
    static ArrayList<Disciplina> disc = new ArrayList<Disciplina>();
    static ArrayList<Aluno> students = new ArrayList<Aluno>();
    static ArrayList<Historico> history = new ArrayList<Historico>();
    static ArrayList<Curso> cursinho = new ArrayList<Curso>();
    
    public static void Cadastrar_Disciplina(Curso curso){ // código para cadastrar disciplina
        
        System.out.println("Digite o nome do professor:");
        String Nome_professor = palavras.nextLine();
        
        System.out.println("Digite o nome da disciplina:");
        String Nome_disciplina = palavras.nextLine();
        
        System.out.println("Digite o numero da disciplina:");
        int Numero = numeros.nextInt();
        
        int Ano, Semestre;
        LocalDate date = LocalDate.now();
        Ano = date.getYear();
        if(date.getMonthValue() <= 6){
            Semestre = 1;
        }
        else{
            Semestre = 2;
        }
        
        disc.add(new Disciplina(Nome_disciplina , Nome_professor, Semestre, Ano, Numero, curso));
        System.out.println("Cadastro CONCLUÍDO com sucesso!");
        
    }
    
    public static void Matricular_Aluno_na_disciplina(){ //código para matricular os alunos nas diciplinas
        System.out.println("Digite o nome do aluno que deseja matricular:");
        String Alune = palavras.nextLine();
        System.out.println("Digite a disciplina que deseja matricular o aluno:");
        String Disci1 = palavras.nextLine();
        
        int cont=0, posicao=0;
        Aluno alunes = null;
        Disciplina discipli = null;
        
        do{ //procura o aluno para matricular em determinada disciplina
            for (Aluno a : students){
                if(a.getNome().equals(Alune)){
                    posicao = cont;
                    alunes = a;
                }
                cont++;
            }
        }while(students == null);
        
        do{ //procura qual a disciplina em que o nome do aluno irá ser inserido
            for(Disciplina d : disc){
                if(d.getNome_disciplina().equals(Disci1)){
                    discipli = d;
                    
                }
            }
        }while(discipli == null);
        
        history.get(posicao).adicionarConceito(null);
       
        history.get(posicao).adicionarDisciplina(discipli);
       
        history.get(posicao).adicionarNotaNumerica(0);
        
        System.out.println("Matricula CONCLUÍDA com sucesso!");
    }
    
    public static void Adicionar_Nota(){ // código para adicionar a nota dos alunos
        System.out.println("Digite a disciplina que deseja definir a nota do aluno:");
        String disciplina = palavras.nextLine();
        
        System.out.println("Digite o aluno que deseja atribuir a nota:");
        String aluno = palavras.nextLine();
        
        System.out.println("Digite a nota do aluno:");
        int nota = numeros.nextInt();
        
        String Conceito = null;
        if(nota>=0 & nota<11){
            Conceito="F";
        }
        if(nota>=11 & nota<=20){
            Conceito="E";
        }
        if(nota>=21 & nota<=40){
            Conceito="D";
        }
        if(nota>=41 & nota<=60){
            Conceito="C";
        }
        if(nota>=61 & nota<=80){
            Conceito="B";
        }
        if(nota>=81 & nota<=100){
            Conceito="A";
        }
        if(nota>100){
            System.out.println("Invalido");
        }
        
        
        System.out.println("Nota adicionada ao boletim do aluno!");
        
        
        for(Historico h : history){
            if(h.getAlunos().getNome().equals(aluno)){ //procura o aluno que terá sua nota adicionada no boletim
                int posicao=0;
                for(int cont=0; cont<h.getDisciplinas().size();cont++){
                    if(h.getDisciplinas().get(cont).getNome().equals(disciplina)){ //procura a disciplina que a nota irá ser lançada 
                        posicao=cont;
                    }
                }

                h.setNotas_Numericas(posicao, nota);
                h.setConceito(posicao, Conceito);
                
               
            }
        }
    }
    
    public static void Listar() {
        System.out.println("Digite a disciplina que deseja ver a lista de aprovados e reprovados: ");
        String disciplina = palavras.nextLine();

        history.forEach((Historico h) -> {
            for (int cont = 0; cont < h.getDisciplinas().size(); cont++) { //procura a disciplina que o usuário deseja ver a lista de aprovados e reprovados
                if (h.getDisciplinas().get(cont).getNome().equals(disciplina)) {
                    if (h.getNotas_Numericas().get(cont) < 60) {
                        System.out.println(h.getAlunos().getNome() + " - Reprovado");
                    }
                    else{
                        System.out.println(h.getAlunos().getNome() + " - Aprovado");
                    }
                    
                }
            }
        });
    }
    
    public static void main(String[] args) { 
        Departamento d1 = new Departamento("Departamento de Informatica", 548294, 55, "37615584");
        Departamento d2 = new Departamento("Departamento de Administracao", 548295, 65, "37612549");
        //instanciar os cursos de exemplo
        cursinho.add(new Curso("Curso Técnico em Metalurgia", "Curso técino integral em Metalurgia", 3599, 78, 2, d1));
        cursinho.add(new Curso("Bacharelado em Informática", "Curso Bacharelado em Informática", 3855, 56, 1, d2));
        //instanciar os professores com as matérias de exemplo
        disc.add(new Disciplina("Janio", "P", 2, 2021, 7, cursinho.get(0)));
        disc.add(new Disciplina("Mauricio", "Prog OO", 1, 2021, 8, cursinho.get(0)));
        disc.add(new Disciplina("Saulo", "Top", 2, 2021, 9, cursinho.get(0)));
        disc.add(new Disciplina("Poliana", "em", 2, 2021, 10, cursinho.get(1)));
        disc.add(new Disciplina("Marcela", "Am", 1, 2021, 11, cursinho.get(1)));
        //instanciar os alunos de exemplo
        students.add(new Aluno("Lorena", "16085273606", "Rua Djalma Campos n°210, Conselheiro Lafaiete", "9723-4008", "Turma A", "Curso Técnico", 2209325, "22/12/2003", 'f', d1, null));
        students.add(new Aluno("Lucia", "2564897530", "Rua Castro Alves n°52, Ouro Branco", "5628-8623", "Turma B", "Curso Técnico", 6325489, "12/08/2000", 'f', d2, null));
        students.add(new Aluno("Jõao", "569872036", "Rua Castelo Branco n°1256, Ouro Branco", "7896-5682", "Turma C", "Curso Técnico", 2568740, "04/12/2000", 'm', d1, null));
        students.add(new Aluno("Alex", "562369701", "Rua Flores n°55, Ouro Branco", "6529-5896", "Turma D", "Curso Técnico", 5629873, "01/01/2001", 'm', d2, null));
        students.add(new Aluno("Maria", "203579563", "Av Pedro Eugênio n°45, Ouro Branco", "4561-8569", "Turma B", "Curso Técnico", 8965423, "22/07/2000", 'f', d1, null));
        students.add(new Aluno("Juliana", "569871236", "Av Amaral Peixoto n°458, Rio de Janeiro", "5698-4526", "Turma A", "Curso Superior", 5689742, "25/05/2000", 'f', d2, null));
        students.add(new Aluno("Marcos", "4556952057", "Rua da Paz n°1455, Ouro Branco", "9856-5412", "Turma B", "Curso Superior", 5632698, "03/09/2000", 'm', d1, null));
        students.add(new Aluno("Bia", "5698716551", "Av José Campos n°56, Belo Horizonte", "9866-6256", "Turma D", "Curso Superior", 8952347, "04/02/2000", 'f', d2, null));
        //adicionar as notas nos historicos
        history.add(new Historico(students.get(0), disc.get(0), null, 0));
        history.add(new Historico(students.get(1), disc.get(4), null, 0));
        history.add(new Historico(students.get(2), disc.get(2), null, 0));
        history.add(new Historico(students.get(3), disc.get(2), null, 0));
        history.add(new Historico(students.get(4), disc.get(1), null, 0));
        history.add(new Historico(students.get(5), disc.get(0), null, 0));
        history.add(new Historico(students.get(6), disc.get(3), null, 0));
        history.add(new Historico(students.get(7), disc.get(4), null, 0));
        //menu
        int n = 0;
        do{
            System.out.println("""
                               Digite o n\u00famero do que deseja fazer:
                               1- Cadastrar disciplina
                               2- Matricular aluno
                               3- Registro de nota de um aluno na disciplina 
                               4- Listar alunos aprovados e reprovados em uma disciplina 
                               5- Sair""");
            
            n = numeros.nextInt();
            if(n>6 || n<0){
                System.out.println("Digite um número válido!");
            }else{
                switch(n){
                    case 1 -> {
                        System.out.println("Digite o curso correspondente a essa disciplina: ");
                        String curso = palavras.nextLine();
                        Curso cursos = null;
                        for(Curso c : cursinho){
                            if(c.getNome().equals(curso)){
                                cursos = c;
                            }
                        }
                        Cadastrar_Disciplina(cursos);
                    }

                    case 2 -> Matricular_Aluno_na_disciplina();
                    case 3 -> Adicionar_Nota();
                    case 4 -> Listar();
                    default -> {
                    }
                }
            }
        }while(n!=5);
      
    }

    private static void Cadastrar_Disciplina(String cursos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
