/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demoproyecto;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class DemoProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        class Question {
            String question;
            String[] options;
            int correctAnswer;

            Question(String question, String[] options, int correctAnswer) {
                this.question = question;
                this.options = options;
                this.correctAnswer = correctAnswer;
            }
        }

        Question[] questions = {
                new Question("¿Cuál es la sintaxis correcta para declarar una variable en Java?",
                        new String[] { "1. int x = 10;", "2. variable x = 10;", "3. let x = 10;", "4. x = 10;" }, 1),
                new Question(
                        "¿Qué estructura de datos sigue el principio de Último en Entrar, Primero en Salir (LIFO)?",
                        new String[] { "1. Cola (Queue)", "2. Pila (Stack)", "3. Arreglo (Array)", "4. HashMap" }, 2),
                new Question("¿Qué palabra clave se utiliza para heredar una clase en Java?",
                        new String[] { "1. implements", "2. interface", "3. extends", "4. inherits" }, 3),
                new Question("¿Qué método se utiliza para iniciar un hilo (thread) en Java?",
                        new String[] { "1. run()", "2. start()", "3. init()", "4. execute()" }, 2),
                new Question("En Java, ¿cuál de estos es una excepción verificada?",
                        new String[] { "1. NullPointerException", "2. ArithmeticException", "3. IOException",
                                "4. IndexOutOfBoundsException" },
                        3)

        };

        Scanner scanner = new Scanner(System.in);

        int points = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].question);
            for (String option : questions[i].options) {
                System.out.println(option);
            }
            int userAnswer = scanner.nextInt();
            if (userAnswer == questions[i].correctAnswer) {
                points++;
            }
        }
        scanner.close();
        System.out.println("You got " + points + " out of " + questions.length + " correct!");
    }
}
