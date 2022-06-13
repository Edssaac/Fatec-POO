package fatec.poo.view;

import fatec.poo.model.Cliente;
import fatec.poo.model.ItemPedido;
import fatec.poo.model.Pedido;
import fatec.poo.model.Pessoa;
import fatec.poo.model.Produto;
import fatec.poo.model.Vendedor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Interface responsável pela emissão de pedidos.
 *
 * @author Barbára Aparecida
 * @author Caique Oliveira
 * @author Edson Isaac
 */
public class GuiEmitirPedido extends javax.swing.JFrame {

    public GuiEmitirPedido(ArrayList<Pedido> arrayPed, ArrayList<Pessoa> arrayCliVend, ArrayList<Produto> arrayProd) {
        clientes = arrayCliVend;
        vendedores = arrayCliVend;
        produtos = arrayProd;
        pedidos = arrayPed;

        initComponents();
        auxTable = (DefaultTableModel) tblProdutos.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPedidoNumero = new javax.swing.JTextField();
        btnPedidoPesquisar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ftfPedidoData = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        cbxPedidoFormaPagamento = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ftfVendedorCPF = new javax.swing.JFormattedTextField();
        btnVendedorPesquisar = new javax.swing.JButton();
        txtVendedorNome = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnIPPesquisar = new javax.swing.JButton();
        txtIPDescricao = new javax.swing.JTextField();
        txtIPCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIPQtdeVendida = new javax.swing.JTextField();
        btnIPAdicionar = new javax.swing.JButton();
        btnIPRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        txtIPTotalPedido = new javax.swing.JTextField();
        txtIPQuantidadeItens = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ftfClienteCPF = new javax.swing.JFormattedTextField();
        btnClientePesquisar = new javax.swing.JButton();
        txtClienteNome = new javax.swing.JTextField();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Emitir Pedido");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedido"));

        jLabel1.setText("Número do Pedido");

        btnPedidoPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnPedidoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoPesquisarActionPerformed(evt);
            }
        });

        jLabel2.setText("Data do Pedido");

        try {
            ftfPedidoData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfPedidoData.setEnabled(false);

        jLabel3.setText("Forma de Pagamento");

        cbxPedidoFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A Vista", "Parcelado" }));
        cbxPedidoFormaPagamento.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPedidoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPedidoPesquisar)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftfPedidoData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxPedidoFormaPagamento, 0, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPedidoPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtPedidoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ftfPedidoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(cbxPedidoFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Vendedor"));

        jLabel7.setText("CPF Vendedor");

        try {
            ftfVendedorCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfVendedorCPF.setEnabled(false);

        btnVendedorPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnVendedorPesquisar.setEnabled(false);
        btnVendedorPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendedorPesquisarActionPerformed(evt);
            }
        });

        txtVendedorNome.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ftfVendedorCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVendedorPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVendedorNome)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(ftfVendedorCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVendedorPesquisar))
                    .addComponent(txtVendedorNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Itens do Pedido"));

        jLabel8.setText("Código do Produto");

        btnIPPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnIPPesquisar.setEnabled(false);
        btnIPPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIPPesquisarActionPerformed(evt);
            }
        });

        txtIPDescricao.setEnabled(false);

        txtIPCodigo.setEnabled(false);

        jLabel5.setText("Qtde Vendida");

        txtIPQtdeVendida.setEnabled(false);

        btnIPAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnIPAdicionar.setText("Adicionar Item");
        btnIPAdicionar.setEnabled(false);
        btnIPAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIPAdicionarActionPerformed(evt);
            }
        });

        btnIPRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/rem.png"))); // NOI18N
        btnIPRemover.setText("Remover Item");
        btnIPRemover.setEnabled(false);
        btnIPRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIPRemoverActionPerformed(evt);
            }
        });

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Prec. Unit.", "Qtde. Vend.", "SubTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProdutos.setEnabled(false);
        jScrollPane1.setViewportView(tblProdutos);

        txtIPTotalPedido.setEnabled(false);

        txtIPQuantidadeItens.setEnabled(false);

        jLabel6.setText("Valor Total do Pedido");

        jLabel9.setText("Quantidade de Itens Pedidos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIPCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIPPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIPDescricao)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIPQtdeVendida, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btnIPAdicionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIPRemover))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIPTotalPedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(txtIPQuantidadeItens, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(btnIPPesquisar)
                        .addComponent(txtIPCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIPDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txtIPQtdeVendida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIPRemover)
                    .addComponent(btnIPAdicionar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIPTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIPQuantidadeItens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Cliente"));

        jLabel4.setText("CPF Cliente");

        try {
            ftfClienteCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfClienteCPF.setEnabled(false);

        btnClientePesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnClientePesquisar.setEnabled(false);
        btnClientePesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientePesquisarActionPerformed(evt);
            }
        });

        txtClienteNome.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ftfClienteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClientePesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClienteNome)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(ftfClienteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnClientePesquisar))
                    .addComponent(txtClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnSair)
                    .addComponent(btnExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Pesquisar pedido pelo código:
    private void btnPedidoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoPesquisarActionPerformed
        boolean existe = false;

        for (int i = 0; i < pedidos.size(); i++) {
            if (txtPedidoNumero.getText().equals(pedidos.get(i).getNumero())) {
                existe = true;
                Cliente clientePedido = pedidos.get(i).getCliente();
                Vendedor vendedorPedido = pedidos.get(i).getVendedor();

                ftfPedidoData.setText(pedidos.get(i).getDataEmissao());
                cbxPedidoFormaPagamento.setSelectedIndex((pedidos.get(i).getFormaPagto()) ? 1 : 0);
                ftfClienteCPF.setText(clientePedido.getCpf());
                txtClienteNome.setText(clientePedido.getNome());
                ftfVendedorCPF.setText(vendedorPedido.getCpf());
                txtVendedorNome.setText(vendedorPedido.getNome());
                break;
            }
        }

        if (!existe) {
            txtPedidoNumero.setEnabled(false);
            btnPedidoPesquisar.setEnabled(false);
            ftfPedidoData.setEnabled(true);
            cbxPedidoFormaPagamento.setEnabled(true);

            ftfClienteCPF.setEnabled(true);
            btnClientePesquisar.setEnabled(true);
        }
    }//GEN-LAST:event_btnPedidoPesquisarActionPerformed

    // Pesquisar cliente pelo cpf:
    private void btnClientePesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientePesquisarActionPerformed
        boolean existe = false;
        boolean formaPagto = (cbxPedidoFormaPagamento.getSelectedIndex() == 0);
        novoPedido = new Pedido(txtPedidoNumero.getText(), ftfPedidoData.getText());
        novoPedido.setFormaPagto(formaPagto);

        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i) instanceof Cliente && ftfClienteCPF.getText().equals(clientes.get(i).getCpf())) {
                existe = true;
                novoPedido.setCliente((Cliente) clientes.get(i));
                txtClienteNome.setText(clientes.get(i).getNome());

                ftfPedidoData.setEnabled(false);
                cbxPedidoFormaPagamento.setEnabled(false);
                ftfClienteCPF.setEnabled(false);
                btnClientePesquisar.setEnabled(false);

                ftfVendedorCPF.setEnabled(true);
                btnVendedorPesquisar.setEnabled(true);
                break;
            }
        }

        if (!existe) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado.", "Atenção", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnClientePesquisarActionPerformed

    // Pesquisar vendedor pelo cpf:
    private void btnVendedorPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendedorPesquisarActionPerformed
        boolean existe = false;

        for (int i = 0; i < vendedores.size(); i++) {
            if (vendedores.get(i) instanceof Vendedor && ftfVendedorCPF.getText().equals(vendedores.get(i).getCpf())) {
                existe = true;
                novoPedido.setVendedor((Vendedor) vendedores.get(i));
                txtVendedorNome.setText(vendedores.get(i).getNome());

                ftfVendedorCPF.setEnabled(false);
                btnVendedorPesquisar.setEnabled(false);

                txtIPCodigo.setEnabled(true);
                btnIPPesquisar.setEnabled(true);
                break;
            }
        }

        if (!existe) {
            JOptionPane.showMessageDialog(null, "Vendedor não encontrado.", "Atenção", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVendedorPesquisarActionPerformed

    // Pesquisar item produto pelo código:
    private void btnIPPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIPPesquisarActionPerformed
        boolean existe = false;
        txtIPDescricao.setText("");
        txtIPQtdeVendida.setText("");

        for (int i = 0; i < produtos.size(); i++) {
            if (txtIPCodigo.getText().equals(produtos.get(i).getCodigo())) {
                existe = true;

                txtIPDescricao.setText(produtos.get(i).getDescricao());
                txtIPQtdeVendida.setEnabled(true);
                btnIPAdicionar.setEnabled(true);
                btnIPRemover.setEnabled(true);

                produtoAtual = produtos.get(i);
                break;
            }
        }

        if (!existe) {
            txtIPQtdeVendida.setEnabled(false);
            btnIPAdicionar.setEnabled(false);
            btnIPRemover.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Produto não encontrado.", "Atenção", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIPPesquisarActionPerformed

    // Adicionar produto na lista:
    private void btnIPAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIPAdicionarActionPerformed
        int quantidadeProduto = Integer.parseInt(txtIPQtdeVendida.getText());

        if (quantidadeProduto <= 0) {
            JOptionPane.showMessageDialog(null, "Quantidade inválida, selecione pelo menos 1.", "Atenção", JOptionPane.ERROR_MESSAGE);
        } else if (produtoAtual.getEstoqueMinimo() < quantidadeProduto) {
            JOptionPane.showMessageDialog(null, "Quantidade maior do que disponível no estoque, por favor selecione menos.", "Atenção", JOptionPane.ERROR_MESSAGE);
        } else {
            ItemPedido ip = new ItemPedido(0, Double.parseDouble(txtIPQtdeVendida.getText()), produtoAtual);

            if (novoPedido.getCliente().getLimiteDisp() < (produtoAtual.getPreco() * quantidadeProduto)) {
                JOptionPane.showMessageDialog(null, "Limite disponível pelo cliente não é suficiente.", "Atenção", JOptionPane.ERROR_MESSAGE);
            } else {
                novoPedido.addItemPedido(ip);

                String linha[] = {produtoAtual.getCodigo(), produtoAtual.getDescricao(), String.valueOf(produtoAtual.getPreco()), txtIPQtdeVendida.getText(), String.valueOf((produtoAtual.getPreco() * quantidadeProduto))};
                auxTable.addRow(linha);

                valorTotalPedido += produtoAtual.getPreco();
                quantidadeItensPedido += quantidadeProduto;
                txtIPTotalPedido.setText(String.valueOf(valorTotalPedido));
                txtIPQuantidadeItens.setText(String.valueOf(quantidadeItensPedido));
            }
        }
    }//GEN-LAST:event_btnIPAdicionarActionPerformed

    // Remover produto da lista:
    private void btnIPRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIPRemoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIPRemoverActionPerformed

    // Incluir dados:
    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIncluirActionPerformed

    // Alterar dados:
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarActionPerformed

    // Excluir dados:
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirActionPerformed

    // Sair da aplicação:
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnClientePesquisar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIPAdicionar;
    private javax.swing.JButton btnIPPesquisar;
    private javax.swing.JButton btnIPRemover;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnPedidoPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVendedorPesquisar;
    private javax.swing.JComboBox<String> cbxPedidoFormaPagamento;
    private javax.swing.JFormattedTextField ftfClienteCPF;
    private javax.swing.JFormattedTextField ftfPedidoData;
    private javax.swing.JFormattedTextField ftfVendedorCPF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtClienteNome;
    private javax.swing.JTextField txtIPCodigo;
    private javax.swing.JTextField txtIPDescricao;
    private javax.swing.JTextField txtIPQtdeVendida;
    private javax.swing.JTextField txtIPQuantidadeItens;
    private javax.swing.JTextField txtIPTotalPedido;
    private javax.swing.JTextField txtPedidoNumero;
    private javax.swing.JTextField txtVendedorNome;
    // End of variables declaration//GEN-END:variables

    private ArrayList<Pessoa> clientes = new ArrayList<>();
    private ArrayList<Pessoa> vendedores = new ArrayList<>();
    private ArrayList<Produto> produtos = new ArrayList<>();
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    private Produto produtoAtual;
    private Pedido novoPedido;
    private double valorTotalPedido = 0;
    private int quantidadeItensPedido = 0;
    private DefaultTableModel auxTable;
}
