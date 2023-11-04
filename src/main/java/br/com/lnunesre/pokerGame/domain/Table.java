package br.com.lnunesre.pokerGame.domain;

import br.com.lnunesre.pokerGame.domain.constants.Card;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class Table {

    private Card flop1;
    private Card flop2;
    private Card flop3;
    private Card turn;
    private Card river;
}
