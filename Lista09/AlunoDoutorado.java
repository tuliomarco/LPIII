package Lista09;

import java.time.LocalDate;

class AlunoDoutorado extends AlunoPosgraduacao {

  public AlunoDoutorado(
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
      'D'
    );
  }

  @Override
  public boolean isRegular() {
    return super.isRegular() && semestre <= 48;
  }
}
