package br.com.lnunesre.pokerGame.useCases;

import br.com.lnunesre.pokerGame.domain.Table;
import br.com.lnunesre.pokerGame.domain.constants.Card;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class GenerateRoundCardsUseCase {

    public Table execute(){

        var table = new Table();

        var cards = Card.values();

        var random = new Random();

        List<Integer> indexes = new ArrayList<>();

        for(int i=0; i<5; i++) {
            int randomIndex = random.nextInt(cards.length);
            indexes.add(randomIndex);
        }

        table.setFlop1(cards[indexes.get(0)]);
        table.setFlop2(cards[indexes.get(1)]);
        table.setFlop3(cards[indexes.get(2)]);
        table.setTurn(cards[indexes.get(3)]);
        table.setRiver(cards[indexes.get(4)]);

        return table;
    }
}
