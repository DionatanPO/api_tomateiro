package com.example.api_tomateiro.model;

import java.text.NumberFormat;
import java.text.ParseException;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustoC {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //C - INSUMOS
    private String calcarioDolomiticoQ;
    private String sulfatoAmonioQ;
    private String superfosfatoSimplesQ;
    private String cloretoPotassioQ;
    private String estercoBovinoQ;
    private String yorinQ;
    private String sementesQ;
    private String confeccaoMudasQ;
    private String fungicidasQ;
    private String herbicidasQ;
    private String inseticidasQ;
    private String outrosProdutosQuimicosQ;
    private String outrosQ;

    private String calcarioDolomiticoV;
    private String sulfatoAmonioV;
    private String superfosfatoSimplesV;
    private String cloretoPotassioV;
    private String estercoBovinoV;
    private String yorinV;
    private String sementesV;
    private String confeccaoMudasV;
    private String fungicidasV;
    private String herbicidasV;
    private String inseticidasV;
    private String outrosProdutosQuimicosV;
    private String outrosV;

    //Subtotais
    private String subTotalC;

    public CustoC() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCalcarioDolomiticoQ() {
        return calcarioDolomiticoQ;
    }

    public void setCalcarioDolomiticoQ(String calcarioDolomiticoQ) {
        this.calcarioDolomiticoQ = calcarioDolomiticoQ;
    }

    public String getSulfatoAmonioQ() {
        return sulfatoAmonioQ;
    }

    public void setSulfatoAmonioQ(String sulfatoAmonioQ) {
        this.sulfatoAmonioQ = sulfatoAmonioQ;
    }

    public String getSuperfosfatoSimplesQ() {
        return superfosfatoSimplesQ;
    }

    public void setSuperfosfatoSimplesQ(String superfosfatoSimplesQ) {
        this.superfosfatoSimplesQ = superfosfatoSimplesQ;
    }

    public String getCloretoPotassioQ() {
        return cloretoPotassioQ;
    }

    public void setCloretoPotassioQ(String cloretoPotassioQ) {
        this.cloretoPotassioQ = cloretoPotassioQ;
    }

    public String getEstercoBovinoQ() {
        return estercoBovinoQ;
    }

    public void setEstercoBovinoQ(String estercoBovinoQ) {
        this.estercoBovinoQ = estercoBovinoQ;
    }

    public String getYorinQ() {
        return yorinQ;
    }

    public void setYorinQ(String yorinQ) {
        this.yorinQ = yorinQ;
    }

    public String getSementesQ() {
        return sementesQ;
    }

    public void setSementesQ(String sementesQ) {
        this.sementesQ = sementesQ;
    }

    public String getConfeccaoMudasQ() {
        return confeccaoMudasQ;
    }

    public void setConfeccaoMudasQ(String confeccaoMudasQ) {
        this.confeccaoMudasQ = confeccaoMudasQ;
    }

    public String getFungicidasQ() {
        return fungicidasQ;
    }

    public void setFungicidasQ(String fungicidasQ) {
        this.fungicidasQ = fungicidasQ;
    }

    public String getHerbicidasQ() {
        return herbicidasQ;
    }

    public void setHerbicidasQ(String herbicidasQ) {
        this.herbicidasQ = herbicidasQ;
    }

    public String getInseticidasQ() {
        return inseticidasQ;
    }

    public void setInseticidasQ(String inseticidasQ) {
        this.inseticidasQ = inseticidasQ;
    }

    public String getOutrosProdutosQuimicosQ() {
        return outrosProdutosQuimicosQ;
    }

    public void setOutrosProdutosQuimicosQ(String outrosProdutosQuimicosQ) {
        this.outrosProdutosQuimicosQ = outrosProdutosQuimicosQ;
    }

    public String getOutrosQ() {
        return outrosQ;
    }

    public void setOutrosQ(String outrosQ) {
        this.outrosQ = outrosQ;
    }

    public String getCalcarioDolomiticoV() {
        return calcarioDolomiticoV;
    }

    public void setCalcarioDolomiticoV(String calcarioDolomiticoV) {
        this.calcarioDolomiticoV = calcarioDolomiticoV;
    }

    public String getSulfatoAmonioV() {
        return sulfatoAmonioV;
    }

    public void setSulfatoAmonioV(String sulfatoAmonioV) {
        this.sulfatoAmonioV = sulfatoAmonioV;
    }

    public String getSuperfosfatoSimplesV() {
        return superfosfatoSimplesV;
    }

    public void setSuperfosfatoSimplesV(String superfosfatoSimplesV) {
        this.superfosfatoSimplesV = superfosfatoSimplesV;
    }

    public String getCloretoPotassioV() {
        return cloretoPotassioV;
    }

    public void setCloretoPotassioV(String cloretoPotassioV) {
        this.cloretoPotassioV = cloretoPotassioV;
    }

    public String getEstercoBovinoV() {
        return estercoBovinoV;
    }

    public void setEstercoBovinoV(String estercoBovinoV) {
        this.estercoBovinoV = estercoBovinoV;
    }

    public String getYorinV() {
        return yorinV;
    }

    public void setYorinV(String yorinV) {
        this.yorinV = yorinV;
    }

    public String getSementesV() {
        return sementesV;
    }

    public void setSementesV(String sementesV) {
        this.sementesV = sementesV;
    }

    public String getConfeccaoMudasV() {
        return confeccaoMudasV;
    }

    public void setConfeccaoMudasV(String confeccaoMudasV) {
        this.confeccaoMudasV = confeccaoMudasV;
    }

    public String getFungicidasV() {
        return fungicidasV;
    }

    public void setFungicidasV(String fungicidasV) {
        this.fungicidasV = fungicidasV;
    }

    public String getHerbicidasV() {
        return herbicidasV;
    }

    public void setHerbicidasV(String herbicidasV) {
        this.herbicidasV = herbicidasV;
    }

    public String getInseticidasV() {
        return inseticidasV;
    }

    public void setInseticidasV(String inseticidasV) {
        this.inseticidasV = inseticidasV;
    }

    public String getOutrosProdutosQuimicosV() {
        return outrosProdutosQuimicosV;
    }

    public void setOutrosProdutosQuimicosV(String outrosProdutosQuimicosV) {
        this.outrosProdutosQuimicosV = outrosProdutosQuimicosV;
    }

    public String getOutrosV() {
        return outrosV;
    }

    public void setOutrosV(String outrosV) {
        this.outrosV = outrosV;
    }

    public String getSubTotalC() {
        return subTotalC;
    }

    public void setSubTotalC(String subTotalC) {
        this.subTotalC = subTotalC;
    }
}
