package trabalhot1;

import javax.swing.JOptionPane;

public class FormTurma extends javax.swing.JFrame {
    
    private int qtdeAlunos = 0;

    public FormTurma() {
        initComponents();
        this.qtdeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos"));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtNotaExercicio = new javax.swing.JTextField();
        txtNotaTrabalho = new javax.swing.JTextField();
        txtNotaProva = new javax.swing.JTextField();
        btnSalvarAluno = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnRelatorioAlunos = new javax.swing.JButton();
        btnNumeroAlunosAprovados = new javax.swing.JButton();
        btnNumeroAlunosReprovados = new javax.swing.JButton();
        btnNumeroAlunosRecuperacao = new javax.swing.JButton();
        btnMediaTurma = new javax.swing.JButton();
        btnMaiorNota = new javax.swing.JButton();
        btnMenorNota = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Turma de ADS");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Turma de ADS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nota de Exercício:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Nota de Trabalho:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Nota de Prova:");

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtNotaExercicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtNotaTrabalho.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtNotaProva.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnSalvarAluno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalvarAluno.setText("Salvar Aluno");
        btnSalvarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlunoActionPerformed(evt);
            }
        });

        btnRelatorioAlunos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRelatorioAlunos.setText("Relatório de Alunos");

        btnNumeroAlunosAprovados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNumeroAlunosAprovados.setText("Número de Alunos Aprovados");

        btnNumeroAlunosReprovados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNumeroAlunosReprovados.setText("Número de Alunos Reprovados");

        btnNumeroAlunosRecuperacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNumeroAlunosRecuperacao.setText("Número de Alunos em Recuperação");

        btnMediaTurma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMediaTurma.setText("Média da Turma");

        btnMaiorNota.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMaiorNota.setText("Maior Nota (Nome + Nota)");

        btnMenorNota.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMenorNota.setText("Menor Nota (Nome + Nota)");

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel6.setText("Peso: 0.2");

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel7.setText("Peso: 0.3");

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel8.setText("Peso: 0.5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalvarAluno)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNotaProva, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNotaTrabalho, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNotaExercicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRelatorioAlunos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNumeroAlunosAprovados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNumeroAlunosReprovados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNumeroAlunosRecuperacao))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnMediaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMaiorNota, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMenorNota, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNotaExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNotaTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNotaProva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvarAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRelatorioAlunos)
                    .addComponent(btnNumeroAlunosAprovados)
                    .addComponent(btnNumeroAlunosReprovados)
                    .addComponent(btnNumeroAlunosRecuperacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMediaTurma)
                    .addComponent(btnMaiorNota)
                    .addComponent(btnMenorNota))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlunoActionPerformed
        
    }//GEN-LAST:event_btnSalvarAlunoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTurma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMaiorNota;
    private javax.swing.JButton btnMediaTurma;
    private javax.swing.JButton btnMenorNota;
    private javax.swing.JButton btnNumeroAlunosAprovados;
    private javax.swing.JButton btnNumeroAlunosRecuperacao;
    private javax.swing.JButton btnNumeroAlunosReprovados;
    private javax.swing.JButton btnRelatorioAlunos;
    private javax.swing.JButton btnSalvarAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNotaExercicio;
    private javax.swing.JTextField txtNotaProva;
    private javax.swing.JTextField txtNotaTrabalho;
    // End of variables declaration//GEN-END:variables
}
