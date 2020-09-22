
public class Carona
{
// variáveis de instância - substitua o exemplo abaixo pelo seu próprio
private String nomeUniversidade;
private String cidadePartida;
private int lugaresDisponiveisIda;
private int lugaresDisponiveisVolta;

public Carona(String universidade, String cidade, int passageirosIda, int passageirosVolta)
{
// inicializa variáveis de instância
nomeUniversidade = universidade;
cidadePartida = cidade;
setLugaresIda(3);
setLugaresVolta(4);
solicitaCaronaIda(passageirosIda);
solicitaCaronaVolta(passageirosVolta);
}

public void setUniversidade(String universidade) {
nomeUniversidade = universidade;
}

public String getUniversidade() {
return nomeUniversidade;
}

public void setCidade(String cidade) {
cidadePartida = cidade;
}

public String getCidade() {
return cidadePartida;
}

public void setLugaresIda(int passageirosIda) {
lugaresDisponiveisIda = passageirosIda;
}

public int getLugaresIda() {
return lugaresDisponiveisIda;
}

public void setLugaresVolta(int passageirosVolta) {
lugaresDisponiveisVolta = passageirosVolta;
}

public int getLugaresVolta() {
return lugaresDisponiveisVolta;
}

public void solicitaCaronaIda(int passageirosIda)
{
if (passageirosIda <= getLugaresIda())
{
int lugaresIda = lugaresDisponiveisIda - passageirosIda;
System.out.println("Lugares solicitados para ir: " + passageirosIda);
System.out.println("Lugares ainda disponiveis: " + lugaresIda);
setLugaresIda(lugaresIda);
}
else
{
System.out.println("Veiculo possui apenas " + lugaresDisponiveisIda + " lugares disponiveis para ir");
}
}

public void solicitaCaronaVolta(int passageirosVolta)
{
if (passageirosVolta <= getLugaresVolta())
{
int lugaresVolta = lugaresDisponiveisVolta - passageirosVolta;
System.out.println("Lugares solicitados para voltar: " + passageirosVolta);
System.out.println("Lugares ainda disponiveis: " + lugaresVolta);
setLugaresVolta(lugaresVolta);
}
else
{
System.out.println("Veiculo possui apenas " + lugaresDisponiveisVolta + " lugares disponiveis para voltar");
}
}

}