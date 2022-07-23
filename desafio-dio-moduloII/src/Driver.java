import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Driver {
    public static void main(String[] args)
    {
       Curso curso_2 = new Curso();
       curso_2.setTitulo("Curso Java");
       curso_2.setDescricao("Curso sobre a linguagem Java e POO");
       curso_2.setCargaHoraria(8);
       //curso_2.toString();

        Curso curso_1 = new Curso();
        curso_1.setTitulo("Curso de Javascript");
        curso_1.setDescricao("Descrição");
        curso_1.setCargaHoraria(4);
        //curso_1.toString();
        Mentoria mentoria_1 = new Mentoria();
        mentoria_1.setTitulo("Javeiros.org");
        mentoria_1.setDescricao("Bora nenem java na veia");
        mentoria_1.setData(LocalDate.now());
        mentoria_1.toString();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp SpringDev");
        bootcamp.setDescricao("Esta é a descrição");
        bootcamp.getConteudos().add(curso_1);
        bootcamp.getConteudos().add(curso_2);
        bootcamp.getConteudos().add(mentoria_1);

        Dev dev_1 = new Dev();
        dev_1.setNome("Ceara");

        Dev dev_2 = new Dev();
        dev_2.setNome("Thiago");

        dev_1.inscreverBootcamp(bootcamp);

        dev_2.inscreverBootcamp(bootcamp);

        System.out.println("Cursos inscritos do " +  dev_1.getNome() +": " + dev_1.getConteudosInscritos());
        System.out.println("Cursos inscritos do " +  dev_2.getNome() +": " + dev_2.getConteudosInscritos());

        dev_1.progredir();
        dev_2.progredir();

        System.out.println("Cursos concluidos do " +  dev_1.getNome() + ": "  + dev_1.getConteudosConluidos());
        System.out.println("Cursos concluidos do " +  dev_2.getNome() + ": "  +
                dev_2.getConteudosConluidos());
    }
}
