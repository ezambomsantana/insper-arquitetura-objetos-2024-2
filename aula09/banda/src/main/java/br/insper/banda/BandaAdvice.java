package br.insper.banda;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class BandaAdvice {

    @ExceptionHandler(BandaNaoEncontradaException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleBandaNaoEncontradaException(BandaNaoEncontradaException e) {
        return e.getMessage();
    }
}
