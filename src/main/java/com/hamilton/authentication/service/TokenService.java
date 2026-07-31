package com.hamilton.authentication.service;

import com.hamilton.authentication.entity.Token;
import com.hamilton.authentication.repository.TokenRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TokenService {
    private final TokenRepository tokenRepository;

    public TokenService(TokenRepository tokenRepository) {
        this.tokenRepository = tokenRepository;
    }

    public Optional<Token> findByToken(String token) {
        return tokenRepository.findByToken(token);
    }

    public void save(Token token) {
        tokenRepository.save(token);
    }
}
