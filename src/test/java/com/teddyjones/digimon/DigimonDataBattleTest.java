package com.teddyjones.digimon;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DigimonDataBattleTest {

    @Test
    void testGetWelcomeMessage() {
        // Arrange
        String expectedMessage = "Welcome to the Digital World Battle Arena!";
        // Act
        String actualMessage = DigimonDataBattle.getWelcomeMessage();
        // Assert
        assertEquals(expectedMessage, actualMessage, "The welcome message should match the expected string.");
    }

    @Test
    void veemonArrayListAttack_shouldCompleteWithoutError() {
        // This test asserts that Veemon's method runs to completion
        // without throwing any exceptions, which we define as a "win".
        assertDoesNotThrow(
                () -> DigimonDataBattle.veemonArrayListAttack(),
                "Veemon's ArrayList attack should complete without errors."
        );
    }

    @Test
    void wormmonLinkedListAttack_shouldCompleteWithoutError() {
        // This test asserts that Wormmon's method runs to completion
        // without throwing any exceptions.
        assertDoesNotThrow(
                () -> DigimonDataBattle.wormmonLinkedListAttack(),
                "Wormmon's LinkedList attack should complete without errors."
        );
    }

    @Test
    void patamonHashtableAttack_shouldCompleteWithoutError() {
        // This test asserts that Patamon's method runs to completion
        // without throwing any exceptions.
        assertDoesNotThrow(
                () -> DigimonDataBattle.patamonHashtableAttack(),
                "Patamon's Hashtable attack should complete without errors."
        );
    }
}