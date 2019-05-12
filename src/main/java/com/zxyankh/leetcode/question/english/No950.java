package com.zxyankh.leetcode.question.english;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * In a deck of cards, every card has a unique integer.  You can order the deck in any order you want.
 * <p>
 * Initially, all the cards start face down (unrevealed) in one deck.
 * <p>
 * Now, you do the following steps repeatedly, until all cards are revealed:
 * <p>
 * Take the top card of the deck, reveal it, and take it out of the deck.
 * If there are still cards in the deck, put the next top card of the deck at the bottom of the deck.
 * If there are still unrevealed cards, go back to step 1.  Otherwise, stop.
 * Return an ordering of the deck that would reveal the cards in increasing order.
 * <p>
 * The first entry in the answer is considered to be the top of the deck.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [17,13,11,2,3,5,7]
 * Output: [2,13,3,11,5,17,7]
 * Explanation:
 * We get the deck in the order [17,13,11,2,3,5,7] (this order doesn't matter), and reorder it.
 * After reordering, the deck starts as [2,13,3,11,5,17,7], where 2 is the top of the deck.
 * We reveal 2, and move 13 to the bottom.  The deck is now [3,11,5,17,7,13].
 * We reveal 3, and move 11 to the bottom.  The deck is now [5,17,7,13,11].
 * We reveal 5, and move 17 to the bottom.  The deck is now [7,13,11,17].
 * We reveal 7, and move 13 to the bottom.  The deck is now [11,17,13].
 * We reveal 11, and move 17 to the bottom.  The deck is now [13,17].
 * We reveal 13, and move 17 to the bottom.  The deck is now [17].
 * We reveal 17.
 * Since all the cards revealed are in increasing order, the answer is correct.
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 1000
 * 1 <= A[i] <= 10^6
 * A[i] != A[j] for all i != j
 *
 * @author ankh
 * @since 20.04.2019
 */
public class No950 {

    public static void main(String[] args) {
        No950 order = new No950();
        int[] a = order.deckRevealedIncreasing(new int[]{17, 13, 11, 2, 3, 5, 7});
        for (int i : a) {
            System.out.println(i);
        }
    }

    public int[] deckRevealedIncreasing(int[] deck) {
        if (deck.length == 1 || deck.length == 2) {
            return deck;
        }
        Deque<Integer> result = new ArrayDeque<>(deck.length);
        result.push(deck[0]);
        for (int i = 1; i < deck.length / 2; i++) {
            int tmp = result.removeLast();
            result.addFirst(tmp);
            result.addFirst(deck[i]);
        }
        for (int i = deck.length - 1; i > deck.length / 2 - 1; i--) {
            int tmp = result.removeLast();
            result.addFirst(tmp);
            result.addFirst(deck[i]);
        }
        int[] a = new int[deck.length];
        for (int i = 0; i < deck.length; i++) {
            a[i] = result.removeFirst();
        }
        return a;
    }

}
