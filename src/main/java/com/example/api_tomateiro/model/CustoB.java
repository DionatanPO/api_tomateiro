package com.example.api_tomateiro.model;

import java.text.NumberFormat;
import java.text.ParseException;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustoB {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //B - OPERAÇÕES MECANIZADAS
    private String colagemQ;
    private String transplantioQ;
    private String estaqueamentoQ;
    private String amontoaQ;
    private String amarracaoQ;
    private String adubacaoBasicaQ;
    private String aplicacaoEstercoQ;
    private String desbrotaQ;
    private String adubacaoCoberturaQ;
    private String pulverizacaoCostalQ;
    private String capinasManuaisQ;
    private String colheitaClassificacaoQ;
    private String irrigacaoQ;

    private String colagemV;
    private String transplantioV;
    private String estaqueamentoV;
    private String amontoaV;
    private String amarracaoV;
    private String adubacaoBasicaV;
    private String aplicacaoEstercoV;
    private String desbrotaV;
    private String adubacaoCoberturaV;
    private String pulverizacaoCostalV;
    private String capinasManuaisV;
    private String colheitaClassificacaoV;
    private String irrigacaoV;

    private String outrosBQ;
    private String outrosBV;

    //Subtotais
    private String subTotalB;

    public CustoB() {
    }


    public String getColagemQ() {
        return colagemQ;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    

    public void setColagemQ(String colagemQ) {
        this.colagemQ = colagemQ;
    }

    public String getTransplantioQ() {
        return transplantioQ;
    }

    public void setTransplantioQ(String transplantioQ) {
        this.transplantioQ = transplantioQ;
    }

    public String getEstaqueamentoQ() {
        return estaqueamentoQ;
    }

    public void setEstaqueamentoQ(String estaqueamentoQ) {
        this.estaqueamentoQ = estaqueamentoQ;
    }

    public String getAmontoaQ() {
        return amontoaQ;
    }

    public void setAmontoaQ(String amontoaQ) {
        this.amontoaQ = amontoaQ;
    }

    public String getAmarracaoQ() {
        return amarracaoQ;
    }

    public void setAmarracaoQ(String amarracaoQ) {
        this.amarracaoQ = amarracaoQ;
    }

    public String getAdubacaoBasicaQ() {
        return adubacaoBasicaQ;
    }

    public void setAdubacaoBasicaQ(String adubacaoBasicaQ) {
        this.adubacaoBasicaQ = adubacaoBasicaQ;
    }

    public String getAplicacaoEstercoQ() {
        return aplicacaoEstercoQ;
    }

    public void setAplicacaoEstercoQ(String aplicacaoEstercoQ) {
        this.aplicacaoEstercoQ = aplicacaoEstercoQ;
    }

    public String getDesbrotaQ() {
        return desbrotaQ;
    }

    public void setDesbrotaQ(String desbrotaQ) {
        this.desbrotaQ = desbrotaQ;
    }

    public String getAdubacaoCoberturaQ() {
        return adubacaoCoberturaQ;
    }

    public void setAdubacaoCoberturaQ(String adubacaoCoberturaQ) {
        this.adubacaoCoberturaQ = adubacaoCoberturaQ;
    }

    public String getPulverizacaoCostalQ() {
        return pulverizacaoCostalQ;
    }

    public void setPulverizacaoCostalQ(String pulverizacaoCostalQ) {
        this.pulverizacaoCostalQ = pulverizacaoCostalQ;
    }

    public String getCapinasManuaisQ() {
        return capinasManuaisQ;
    }

    public void setCapinasManuaisQ(String capinasManuaisQ) {
        this.capinasManuaisQ = capinasManuaisQ;
    }

    public String getColheitaClassificacaoQ() {
        return colheitaClassificacaoQ;
    }

    public void setColheitaClassificacaoQ(String colheitaClassificacaoQ) {
        this.colheitaClassificacaoQ = colheitaClassificacaoQ;
    }

    public String getColheitaClassificacaoV() {
        return colheitaClassificacaoV;
    }

    public void setColheitaClassificacaoV(String colheitaClassificacaoV) {
        this.colheitaClassificacaoV = colheitaClassificacaoV;
    }


    public String getIrrigacaoQ() {
        return irrigacaoQ;
    }

    public void setIrrigacaoQ(String irrigacaoQ) {
        this.irrigacaoQ = irrigacaoQ;
    }

    public String getColagemV() {
        return colagemV;
    }

    public void setColagemV(String colagemV) {
        this.colagemV = colagemV;
    }

    public String getTransplantioV() {
        return transplantioV;
    }

    public void setTransplantioV(String transplantioV) {
        this.transplantioV = transplantioV;
    }

    public String getEstaqueamentoV() {
        return estaqueamentoV;
    }

    public void setEstaqueamentoV(String estaqueamentoV) {
        this.estaqueamentoV = estaqueamentoV;
    }

    public String getAmontoaV() {
        return amontoaV;
    }

    public void setAmontoaV(String amontoaV) {
        this.amontoaV = amontoaV;
    }

    public String getAmarracaoV() {
        return amarracaoV;
    }

    public void setAmarracaoV(String amarracaoV) {
        this.amarracaoV = amarracaoV;
    }

    public String getAdubacaoBasicaV() {
        return adubacaoBasicaV;
    }

    public void setAdubacaoBasicaV(String adubacaoBasicaV) {
        this.adubacaoBasicaV = adubacaoBasicaV;
    }

    public String getAplicacaoEstercoV() {
        return aplicacaoEstercoV;
    }

    public void setAplicacaoEstercoV(String aplicacaoEstercoV) {
        this.aplicacaoEstercoV = aplicacaoEstercoV;
    }

    public String getDesbrotaV() {
        return desbrotaV;
    }

    public void setDesbrotaV(String desbrotaV) {
        this.desbrotaV = desbrotaV;
    }

    public String getAdubacaoCoberturaV() {
        return adubacaoCoberturaV;
    }

    public void setAdubacaoCoberturaV(String adubacaoCoberturaV) {
        this.adubacaoCoberturaV = adubacaoCoberturaV;
    }

    public String getPulverizacaoCostalV() {
        return pulverizacaoCostalV;
    }

    public void setPulverizacaoCostalV(String pulverizacaoCostalV) {
        this.pulverizacaoCostalV = pulverizacaoCostalV;
    }

    public String getCapinasManuaisV() {
        return capinasManuaisV;
    }

    public void setCapinasManuaisV(String capinasManuaisV) {
        this.capinasManuaisV = capinasManuaisV;
    }


    public String getIrrigacaoV() {
        return irrigacaoV;
    }

    public void setIrrigacaoV(String irrigacaoV) {
        this.irrigacaoV = irrigacaoV;
    }

    public String getOutrosBQ() {
        return outrosBQ;
    }

    public void setOutrosBQ(String outrosBQ) {
        this.outrosBQ = outrosBQ;
    }

    public String getOutrosBV() {
        return outrosBV;
    }

    public void setOutrosBV(String outrosBV) {
        this.outrosBV = outrosBV;
    }

    public String getSubTotalB() {
        return subTotalB;
    }

    public void setSubTotalB(String subTotalB) {
        this.subTotalB = subTotalB;
    }
}
