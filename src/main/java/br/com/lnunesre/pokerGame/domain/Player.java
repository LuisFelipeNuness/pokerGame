package br.com.lnunesre.pokerGame.domain;


import br.com.lnunesre.pokerGame.domain.constants.Card;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class Player {

    private long id;
    private String username;
    private BigDecimal cash;
    private Card card1;
    private Card card2;
    private boolean isSmallBlind;
    private boolean isBigBlind;
    private boolean isDealer;
    private String action;
}
