package br.com.dio.estudo;

import br.com.dio.estudo.dominio.Bootcamp;
import br.com.dio.estudo.dominio.Curso;
import br.com.dio.estudo.dominio.Dev;
import br.com.dio.estudo.dominio.Mentoria;
import br.com.dio.estudo.exception.BussinessException;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso 2");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descricao mentoria java");
        mentoria.setData(LocalDate.now());
/*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
 */
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp TQI Kotlin - Backend Developer");
        bootcamp.setDescricao("O Bootcamp TQI Kotlin - Backend Developer é um programa gratuito para formação de profissionais que estão iniciando sua carreira e buscam mais conhecimento técnico em desenvolvimento back-end. E, claro, para qualquer pessoa que queira aprender, evoluir e se tornar um profissional de tecnologia. O programa conta com mais de 100 horas de experiências educacionais, incluindo atividades didáticas e, também, desafios práticos para que você tenha o aprendizado completo. Além disso, para tornar sua jornada ainda mais completa, você terá a oportunidade de assistir mentorias ao vivo com os(as) experts da TQI! Os melhores classificados no Bootcamp serão selecionados para seguir nas fases seguintes do processo seletivo de contratação.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("DEV EDILSON");
        Dev devEdilson = new Dev();
        devEdilson.setNome("Edilson");
        devEdilson.inscreverBootcamp(bootcamp);
        System.out.println(devEdilson.getConteudosInscritos());
        progredirCurso(devEdilson);
        progredirCurso(devEdilson);
        System.out.println(devEdilson.getConteudosConcluidos());
        System.out.println(devEdilson.getConteudosInscritos());
        System.out.println("XP: " + devEdilson.calcularTotalXp());
        System.out.println("---------------------------------");

        System.out.println("DEV JOAO");
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        //devJoao.inscreverBootcamp(bootcamp);
        System.out.println(devJoao.getConteudosInscritos());
        progredirCurso(devJoao);
        System.out.println(devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
        System.out.println("---------------------------------");

    }

    private static void progredirCurso(Dev dev) {
        try {
            dev.progredir();
            System.out.println("DEV " + dev.getNome() + " progrediu...");
        } catch (BussinessException e) {
            System.out.println(e.getMessage());
        }
    }
}
