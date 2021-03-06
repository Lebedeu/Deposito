/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Funcionario;
import Model.FuncionarioDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author antun
 */
public class TelaCadastroFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroFuncionario
     */
    public TelaCadastroFuncionario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCadastrar = new javax.swing.JMenu();
        MenuCadastrarFuncionario = new javax.swing.JMenuItem();
        MenuCadastrarFerramenta = new javax.swing.JMenuItem();
        MenuCadastrarEPI = new javax.swing.JMenuItem();
        MenuCadastrarEPC = new javax.swing.JMenuItem();
        MenuListar = new javax.swing.JMenu();
        MenuListarFuncionario = new javax.swing.JMenuItem();
        MenuListarFerramenta = new javax.swing.JMenuItem();
        MenuListarEPI = new javax.swing.JMenuItem();
        MenuListarEPC = new javax.swing.JMenuItem();
        MenuAtualizar = new javax.swing.JMenu();
        MenuAtualizarFuncionario = new javax.swing.JMenuItem();
        MenuAtualizarFerramenta = new javax.swing.JMenuItem();
        MenuAtualizarEPI = new javax.swing.JMenuItem();
        MenuAtualizarEPC = new javax.swing.JMenuItem();
        MenuDeletar = new javax.swing.JMenu();
        MenuDeletarFuncionario = new javax.swing.JMenuItem();
        MenuDeletarFerramenta = new javax.swing.JMenuItem();
        MenuDeletarEPI = new javax.swing.JMenuItem();
        MenuDeletarEPC = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        EntradaTextoRegistro = new javax.swing.JTextField();
        EntradaTextoNome = new javax.swing.JTextField();
        EntradaTextoCPF = new javax.swing.JTextField();
        BotaoCancelarCadastroFuncionario = new javax.swing.JButton();
        BotaoCadastrarFuncionario = new javax.swing.JButton();
        BotaoVoltarCadastroFuncionario = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        MenuCadastrar2 = new javax.swing.JMenu();
        MenuCadastrarFuncionario2 = new javax.swing.JMenuItem();
        MenuCadastrarFerramenta2 = new javax.swing.JMenuItem();
        MenuCadastrarEPI2 = new javax.swing.JMenuItem();
        MenuCadastrarEPC2 = new javax.swing.JMenuItem();
        MenuListar2 = new javax.swing.JMenu();
        MenuListarFuncionario2 = new javax.swing.JMenuItem();
        MenuListarFerramenta2 = new javax.swing.JMenuItem();
        MenuListarEPI2 = new javax.swing.JMenuItem();
        MenuListarEPC2 = new javax.swing.JMenuItem();
        MenuAtualizar2 = new javax.swing.JMenu();
        MenuAtualizarFuncionario2 = new javax.swing.JMenuItem();
        MenuAtualizarFerramenta2 = new javax.swing.JMenuItem();
        MenuAtualizarEPI2 = new javax.swing.JMenuItem();
        MenuAtualizarEPC2 = new javax.swing.JMenuItem();
        MenuDeletar2 = new javax.swing.JMenu();
        MenuDeletarFuncionario2 = new javax.swing.JMenuItem();
        MenuDeletarFerramenta2 = new javax.swing.JMenuItem();
        MenuDeletarEPI2 = new javax.swing.JMenuItem();
        MenuDeletarEPC2 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        MenuCadastrar.setText("Cadastrar");

        MenuCadastrarFuncionario.setText("Funcionario");
        MenuCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastrarFuncionarioActionPerformed(evt);
            }
        });
        MenuCadastrar.add(MenuCadastrarFuncionario);

        MenuCadastrarFerramenta.setText("Ferramenta");
        MenuCadastrar.add(MenuCadastrarFerramenta);

        MenuCadastrarEPI.setText("EPI");
        MenuCadastrarEPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastrarEPIActionPerformed(evt);
            }
        });
        MenuCadastrar.add(MenuCadastrarEPI);

        MenuCadastrarEPC.setText("EPC");
        MenuCadastrarEPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastrarEPCActionPerformed(evt);
            }
        });
        MenuCadastrar.add(MenuCadastrarEPC);

        jMenuBar1.add(MenuCadastrar);

        MenuListar.setText("Listar");

        MenuListarFuncionario.setText("Funcionario");
        MenuListarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListarFuncionarioActionPerformed(evt);
            }
        });
        MenuListar.add(MenuListarFuncionario);

        MenuListarFerramenta.setText("Ferramenta");
        MenuListar.add(MenuListarFerramenta);

        MenuListarEPI.setText("EPI");
        MenuListarEPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListarEPIActionPerformed(evt);
            }
        });
        MenuListar.add(MenuListarEPI);

        MenuListarEPC.setText("EPC");
        MenuListar.add(MenuListarEPC);

        jMenuBar1.add(MenuListar);

        MenuAtualizar.setText("Atualizar");

        MenuAtualizarFuncionario.setText("Funcionario");
        MenuAtualizarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAtualizarFuncionarioActionPerformed(evt);
            }
        });
        MenuAtualizar.add(MenuAtualizarFuncionario);

        MenuAtualizarFerramenta.setText("Ferramenta");
        MenuAtualizar.add(MenuAtualizarFerramenta);

        MenuAtualizarEPI.setText("EPI");
        MenuAtualizar.add(MenuAtualizarEPI);

        MenuAtualizarEPC.setText("EPC");
        MenuAtualizar.add(MenuAtualizarEPC);

        jMenuBar1.add(MenuAtualizar);

        MenuDeletar.setText("Deletar");

        MenuDeletarFuncionario.setText("Funcionario");
        MenuDeletar.add(MenuDeletarFuncionario);

        MenuDeletarFerramenta.setText("Ferramenta");
        MenuDeletar.add(MenuDeletarFerramenta);

        MenuDeletarEPI.setText("EPI");
        MenuDeletarEPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDeletarEPIActionPerformed(evt);
            }
        });
        MenuDeletar.add(MenuDeletarEPI);

        MenuDeletarEPC.setText("EPC");
        MenuDeletar.add(MenuDeletarEPC);

        jMenuBar1.add(MenuDeletar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EntradaTextoRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro"));
        EntradaTextoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaTextoRegistroActionPerformed(evt);
            }
        });

        EntradaTextoNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

        EntradaTextoCPF.setBorder(javax.swing.BorderFactory.createTitledBorder("CPF"));

        BotaoCancelarCadastroFuncionario.setText("Cancelar");
        BotaoCancelarCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarCadastroFuncionarioActionPerformed(evt);
            }
        });

        BotaoCadastrarFuncionario.setText("Cadastrar");
        BotaoCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarFuncionarioActionPerformed(evt);
            }
        });

        BotaoVoltarCadastroFuncionario.setText("Voltar");
        BotaoVoltarCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarCadastroFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EntradaTextoRegistro)
                    .addComponent(EntradaTextoNome)
                    .addComponent(EntradaTextoCPF)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 206, Short.MAX_VALUE)
                        .addComponent(BotaoCadastrarFuncionario)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotaoVoltarCadastroFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotaoCancelarCadastroFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(EntradaTextoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EntradaTextoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EntradaTextoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoCancelarCadastroFuncionario)
                    .addComponent(BotaoCadastrarFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                .addComponent(BotaoVoltarCadastroFuncionario)
                .addContainerGap())
        );

        MenuCadastrar2.setText("Cadastrar");

        MenuCadastrarFuncionario2.setText("Funcionario");
        MenuCadastrarFuncionario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastrarFuncionario2ActionPerformed(evt);
            }
        });
        MenuCadastrar2.add(MenuCadastrarFuncionario2);

        MenuCadastrarFerramenta2.setText("Ferramenta");
        MenuCadastrarFerramenta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastrarFerramenta2ActionPerformed(evt);
            }
        });
        MenuCadastrar2.add(MenuCadastrarFerramenta2);

        MenuCadastrarEPI2.setText("EPI");
        MenuCadastrarEPI2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastrarEPI2ActionPerformed(evt);
            }
        });
        MenuCadastrar2.add(MenuCadastrarEPI2);

        MenuCadastrarEPC2.setText("EPC");
        MenuCadastrarEPC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastrarEPC2ActionPerformed(evt);
            }
        });
        MenuCadastrar2.add(MenuCadastrarEPC2);

        jMenuBar2.add(MenuCadastrar2);

        MenuListar2.setText("Listar");

        MenuListarFuncionario2.setText("Funcionario");
        MenuListarFuncionario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListarFuncionario2ActionPerformed(evt);
            }
        });
        MenuListar2.add(MenuListarFuncionario2);

        MenuListarFerramenta2.setText("Ferramenta");
        MenuListarFerramenta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListarFerramenta2ActionPerformed(evt);
            }
        });
        MenuListar2.add(MenuListarFerramenta2);

        MenuListarEPI2.setText("EPI");
        MenuListarEPI2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListarEPI2ActionPerformed(evt);
            }
        });
        MenuListar2.add(MenuListarEPI2);

        MenuListarEPC2.setText("EPC");
        MenuListarEPC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListarEPC2ActionPerformed(evt);
            }
        });
        MenuListar2.add(MenuListarEPC2);

        jMenuBar2.add(MenuListar2);

        MenuAtualizar2.setText("Atualizar");

        MenuAtualizarFuncionario2.setText("Funcionario");
        MenuAtualizarFuncionario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAtualizarFuncionario2ActionPerformed(evt);
            }
        });
        MenuAtualizar2.add(MenuAtualizarFuncionario2);

        MenuAtualizarFerramenta2.setText("Ferramenta");
        MenuAtualizarFerramenta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAtualizarFerramenta2ActionPerformed(evt);
            }
        });
        MenuAtualizar2.add(MenuAtualizarFerramenta2);

        MenuAtualizarEPI2.setText("EPI");
        MenuAtualizarEPI2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAtualizarEPI2ActionPerformed(evt);
            }
        });
        MenuAtualizar2.add(MenuAtualizarEPI2);

        MenuAtualizarEPC2.setText("EPC");
        MenuAtualizarEPC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAtualizarEPC2ActionPerformed(evt);
            }
        });
        MenuAtualizar2.add(MenuAtualizarEPC2);

        jMenuBar2.add(MenuAtualizar2);

        MenuDeletar2.setText("Deletar");

        MenuDeletarFuncionario2.setText("Funcionario");
        MenuDeletarFuncionario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDeletarFuncionario2ActionPerformed(evt);
            }
        });
        MenuDeletar2.add(MenuDeletarFuncionario2);

        MenuDeletarFerramenta2.setText("Ferramenta");
        MenuDeletarFerramenta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDeletarFerramenta2ActionPerformed(evt);
            }
        });
        MenuDeletar2.add(MenuDeletarFerramenta2);

        MenuDeletarEPI2.setText("EPI");
        MenuDeletarEPI2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDeletarEPI2ActionPerformed(evt);
            }
        });
        MenuDeletar2.add(MenuDeletarEPI2);

        MenuDeletarEPC2.setText("EPC");
        MenuDeletarEPC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDeletarEPC2ActionPerformed(evt);
            }
        });
        MenuDeletar2.add(MenuDeletarEPC2);

        jMenuBar2.add(MenuDeletar2);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastrarFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuCadastrarFuncionarioActionPerformed

    private void MenuCadastrarEPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastrarEPIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuCadastrarEPIActionPerformed

    private void MenuCadastrarEPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastrarEPCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuCadastrarEPCActionPerformed

    private void MenuListarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListarFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuListarFuncionarioActionPerformed

    private void MenuListarEPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListarEPIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuListarEPIActionPerformed

    private void MenuAtualizarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAtualizarFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuAtualizarFuncionarioActionPerformed

    private void MenuDeletarEPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDeletarEPIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuDeletarEPIActionPerformed

    private void EntradaTextoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaTextoRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntradaTextoRegistroActionPerformed

    private void BotaoCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarFuncionarioActionPerformed

        Funcionario funcionario = new Funcionario(
                Integer.parseInt(EntradaTextoRegistro.getText()),
                EntradaTextoNome.getText(),
                EntradaTextoCPF.getText());

        FuncionarioDAO funcionariodao = new FuncionarioDAO();
        if (!funcionariodao.buscarFuncionarioSemFiltro().contains(EntradaTextoRegistro)) {
            funcionariodao.inserirFuncionario(funcionario);
            System.out.println("Cadastrado");
        } else {
            System.out.println("Funcionario ja cadastrado");
        }
        
        JOptionPane.showMessageDialog(null, "Cadastro Confirmado", null, HEIGHT);
        
        EntradaTextoRegistro.setText("");
        EntradaTextoNome.setText("");
        EntradaTextoCPF.setText("");

    }//GEN-LAST:event_BotaoCadastrarFuncionarioActionPerformed

    private void BotaoCancelarCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarCadastroFuncionarioActionPerformed
        EntradaTextoRegistro.setText("");
        EntradaTextoNome.setText("");
        EntradaTextoCPF.setText("");
    }//GEN-LAST:event_BotaoCancelarCadastroFuncionarioActionPerformed

    private void BotaoVoltarCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarCadastroFuncionarioActionPerformed
        TelaInicial t = new TelaInicial();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotaoVoltarCadastroFuncionarioActionPerformed

    private void MenuCadastrarFuncionario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastrarFuncionario2ActionPerformed
        TelaCadastroFuncionario t = new TelaCadastroFuncionario();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuCadastrarFuncionario2ActionPerformed

    private void MenuCadastrarFerramenta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastrarFerramenta2ActionPerformed
        TelaCadastroFerramenta t = new TelaCadastroFerramenta();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuCadastrarFerramenta2ActionPerformed

    private void MenuCadastrarEPI2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastrarEPI2ActionPerformed
        TelaCadastroEPI t = new TelaCadastroEPI();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuCadastrarEPI2ActionPerformed

    private void MenuCadastrarEPC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastrarEPC2ActionPerformed
        TelaCadastroEPC t = new TelaCadastroEPC();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuCadastrarEPC2ActionPerformed

    private void MenuListarFuncionario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListarFuncionario2ActionPerformed
        TelaListarFuncionario t = new TelaListarFuncionario();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuListarFuncionario2ActionPerformed

    private void MenuListarFerramenta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListarFerramenta2ActionPerformed
        TelaListarFerramenta t = new TelaListarFerramenta();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuListarFerramenta2ActionPerformed

    private void MenuListarEPI2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListarEPI2ActionPerformed
        TelaListarEPI t = new TelaListarEPI();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuListarEPI2ActionPerformed

    private void MenuListarEPC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListarEPC2ActionPerformed
        TelaListarEPC t = new TelaListarEPC();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuListarEPC2ActionPerformed

    private void MenuAtualizarFuncionario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAtualizarFuncionario2ActionPerformed
        TelaAtualizarFuncionario t = new TelaAtualizarFuncionario();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuAtualizarFuncionario2ActionPerformed

    private void MenuAtualizarFerramenta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAtualizarFerramenta2ActionPerformed
        TelaAtualizarFerramenta t = new TelaAtualizarFerramenta();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuAtualizarFerramenta2ActionPerformed

    private void MenuAtualizarEPI2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAtualizarEPI2ActionPerformed
        TelaAtualizarEPI t = new TelaAtualizarEPI();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuAtualizarEPI2ActionPerformed

    private void MenuAtualizarEPC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAtualizarEPC2ActionPerformed
        TelaAtualizarEPC t = new TelaAtualizarEPC();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuAtualizarEPC2ActionPerformed

    private void MenuDeletarFuncionario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDeletarFuncionario2ActionPerformed
        TelaDeletarFuncionario t = new TelaDeletarFuncionario();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuDeletarFuncionario2ActionPerformed

    private void MenuDeletarFerramenta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDeletarFerramenta2ActionPerformed
        TelaDeletarFerramenta t = new TelaDeletarFerramenta();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuDeletarFerramenta2ActionPerformed

    private void MenuDeletarEPI2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDeletarEPI2ActionPerformed
        TelaDeletarEPI t = new TelaDeletarEPI();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuDeletarEPI2ActionPerformed

    private void MenuDeletarEPC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDeletarEPC2ActionPerformed
        TelaDeletarEPC t = new TelaDeletarEPC();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuDeletarEPC2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastrarFuncionario;
    private javax.swing.JButton BotaoCancelarCadastroFuncionario;
    private javax.swing.JButton BotaoVoltarCadastroFuncionario;
    private javax.swing.JTextField EntradaTextoCPF;
    private javax.swing.JTextField EntradaTextoNome;
    private javax.swing.JTextField EntradaTextoRegistro;
    private javax.swing.JMenu MenuAtualizar;
    private javax.swing.JMenu MenuAtualizar2;
    private javax.swing.JMenuItem MenuAtualizarEPC;
    private javax.swing.JMenuItem MenuAtualizarEPC2;
    private javax.swing.JMenuItem MenuAtualizarEPI;
    private javax.swing.JMenuItem MenuAtualizarEPI2;
    private javax.swing.JMenuItem MenuAtualizarFerramenta;
    private javax.swing.JMenuItem MenuAtualizarFerramenta2;
    private javax.swing.JMenuItem MenuAtualizarFuncionario;
    private javax.swing.JMenuItem MenuAtualizarFuncionario2;
    private javax.swing.JMenu MenuCadastrar;
    private javax.swing.JMenu MenuCadastrar2;
    private javax.swing.JMenuItem MenuCadastrarEPC;
    private javax.swing.JMenuItem MenuCadastrarEPC2;
    private javax.swing.JMenuItem MenuCadastrarEPI;
    private javax.swing.JMenuItem MenuCadastrarEPI2;
    private javax.swing.JMenuItem MenuCadastrarFerramenta;
    private javax.swing.JMenuItem MenuCadastrarFerramenta2;
    private javax.swing.JMenuItem MenuCadastrarFuncionario;
    private javax.swing.JMenuItem MenuCadastrarFuncionario2;
    private javax.swing.JMenu MenuDeletar;
    private javax.swing.JMenu MenuDeletar2;
    private javax.swing.JMenuItem MenuDeletarEPC;
    private javax.swing.JMenuItem MenuDeletarEPC2;
    private javax.swing.JMenuItem MenuDeletarEPI;
    private javax.swing.JMenuItem MenuDeletarEPI2;
    private javax.swing.JMenuItem MenuDeletarFerramenta;
    private javax.swing.JMenuItem MenuDeletarFerramenta2;
    private javax.swing.JMenuItem MenuDeletarFuncionario;
    private javax.swing.JMenuItem MenuDeletarFuncionario2;
    private javax.swing.JMenu MenuListar;
    private javax.swing.JMenu MenuListar2;
    private javax.swing.JMenuItem MenuListarEPC;
    private javax.swing.JMenuItem MenuListarEPC2;
    private javax.swing.JMenuItem MenuListarEPI;
    private javax.swing.JMenuItem MenuListarEPI2;
    private javax.swing.JMenuItem MenuListarFerramenta;
    private javax.swing.JMenuItem MenuListarFerramenta2;
    private javax.swing.JMenuItem MenuListarFuncionario;
    private javax.swing.JMenuItem MenuListarFuncionario2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
