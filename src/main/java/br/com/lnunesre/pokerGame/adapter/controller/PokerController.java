package br.com.lnunesre.pokerGame.adapter.controller;

import br.com.lnunesre.pokerGame.domain.Table;
import br.com.lnunesre.pokerGame.useCases.GenerateRoundCardsUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/poker")
@AllArgsConstructor
public class PokerController {

    private final GenerateRoundCardsUseCase generateRoundCardsUseCase;

    @CrossOrigin
    @GetMapping
    public Table generateTable(){
        return generateRoundCardsUseCase.execute();
    }
}
