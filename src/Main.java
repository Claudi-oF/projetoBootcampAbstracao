import DesafioDominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Um curso especializado em Java");
        curso1.setCargaHoraria(50);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C#");
        curso2.setDescricao("Um curso especializado em C#");
        curso2.setCargaHoraria(45);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Pascal");
        mentoria1.setData(LocalDate.now());
        mentoria1.setDescricao("Um curso especializado em Pascal");

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Um bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devClaudio = new Dev();
        devClaudio.setNome("Claudio");
        devClaudio.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Claudio" + devClaudio.getConteudosInscritos());
        devClaudio.Progredir();
        devClaudio.Progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Claudio" + devClaudio.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Claudio" + devClaudio.getConteudosConcluidos());
        System.out.println("XP: " + devClaudio.CalcularXp());

        System.out.println("-----------------");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Pedro" + devPedro.getConteudosInscritos());
        devPedro.Progredir();
        devPedro.Progredir();
        devPedro.Progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Claudio" + devPedro.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Pedro" + devPedro.getConteudosConcluidos());
        System.out.println("XP: " + devPedro.CalcularXp());

    }
}