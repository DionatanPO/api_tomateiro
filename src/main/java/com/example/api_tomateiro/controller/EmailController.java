/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.api_tomateiro.controller;

import com.example.api_tomateiro.model.Email;
import com.example.api_tomateiro.model.Produtor;
import com.example.api_tomateiro.repository.ProdutorRepository;
import java.io.IOException;
import java.util.List;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Dionatan
 */
@RestController
public class EmailController {

    @Autowired
    ProdutorRepository produtorRepository;

    @RequestMapping(value = "/sendemail/{cod}/{email}")
    public String sendEmail(@PathVariable Long cod, @PathVariable String email) throws AddressException, MessagingException, IOException {

        List<Produtor> list = produtorRepository.findProdutorByCodIdentificacao(cod);
        Email e = new Email();

        if (list.size() > 0) {
            e.sendmail(email, list.get(0).getSenha());
        } else {
            e.sendmail(email, "");
        }

        return "Email sent successfully";
    }
}
