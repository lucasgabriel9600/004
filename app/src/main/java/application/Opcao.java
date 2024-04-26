package application.models;

public class Opcao {

private long id;
private String descricao;
private boolean correto;

public getId(){
    return id;

}
public setId(long id){
    this.id = id;
}
public String getDescricao(){
    return descricao;
}
public void setCorreto(boolean correto){
    this.correto = correto;
}
}