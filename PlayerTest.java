package com.germangascon.ed;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

        private Player player;
        

        @BeforeEach
        void setUp() {
            player = new Player("Steve", 100, 10);
        }

        @AfterEach
        void tearDown() {
            player = null;
        }
        @Test
        void verificarAtributosInicialesConConfig() {
    
            assertEquals(NOMBRE, player.getNombre(), "El nombre debe ser el de Config"),
            assertEquals(PLAYER_VIDA, player.getVida(), "La vida debe ser la de Config"),
            assertEquals(PLAYER_ATAQUE, player.getDanyo(), "El ataque debe ser el de Config"));
        }
        @Test
        void curarSumaVida() {
            player = new Player("Steve", 5, 10);
            player.curar(5);
            assertEquals(10, player.getVida());
        }

        @Test
        void curarHastaMaximoExacto() {
            player = new Player("Steve", 80, 10);
            player.curar(20);
            assertEquals(100, player.getVida());
        }

        @Test
        void curarAUnMuertoNoFunciona() {
            // Usamos el player de 100 de vida creado en el @BeforeEach
            player.recibirDanyo(100);
            player.curar(100);
            assertEquals(0, player.getVida(), "Un jugador muerto no debería poder curarse.");
        }
    }


