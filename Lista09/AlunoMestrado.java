package Lista09;

import java.time.LocalDate;

class AlunoMestrado extends AlunoPosgraduacao {

  public AlunoMestrado(
    String nome,
    String matricula,
    LocalDate dataAdmissao,
    int semestre,
    String tipoCurso,
    String orientador,
    String tituloProjeto
  ) {
    super(
      nome,
      matricula,
      dataAdmissao,
      semestre,
      tipoCurso,
      orientador,
      tituloProjeto,
      'M'
    );
  }

  @Override
  public boolean isRegular() {
    return super.isRegular() && semestre <= 24;
  }
}
