package br.eng.andreduarte.jokenorris.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by Andre on 9/11/17.
 */
@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes quotes;

    public JokeServiceImpl() {
        this.quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
