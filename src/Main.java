import DesafioDominio.Curso;
import DesafioDominio.Mentoria;

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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}