/* 
 * Copyright 2019 Mario Merlos Abella <mario.merlos.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Mario Merlos Abella <mario.merlos.alum@iescamp.es>
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {

        //variables & Constantes
        final int MAX = 6;
        final int MIN = 0;
        final char P_MAX = 'Z';
        final char P_MIN = 'A';
        int numero;

        //Estado inicial
        numero = MIN;

        //Inicio bucle
        System.out.print("Password ...: ");
        do {
            char password = (char) (RND.nextInt(P_MAX - P_MIN + 1) + P_MIN);
            numero++;
            System.out.printf("%c", password);

        } while (numero < MAX);
        System.out.println("");
        System.out.println("END");
    }
}