/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import Controle.TorrentFilesManage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import Modelo.Arquivo;
import com.google.gson.Gson;
import Controle.Conexao;
import Modelo.ArquivoDownload;
import Modelo.Listas;
import Modelo.PeerModelo;
import static aplicacao.TelaPrincipal.listaArquivos;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raphael Felipe
 */
public class TelaLista extends javax.swing.JPanel {

    /**
     * Creates new form telalog
     */
    
    public TelaLista() {
        initComponents();
        barra.setStringPainted(false);
    }
    
    Map<String, Arquivo> fileMap = new HashMap<>();
    
    TorrentFilesManage  tfm = new TorrentFilesManage();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnDownload = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaDeArquivos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnAtualizar = new javax.swing.JLabel();
        barra = new javax.swing.JProgressBar();

        jPanel1.setBackground(new java.awt.Color(0, 20, 10));
        jPanel1.setPreferredSize(new java.awt.Dimension(391, 420));
        jPanel1.setRequestFocusEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Lista de arquivos para download:");

        jPanel2.setBackground(new java.awt.Color(0, 206, 149));

        btnDownload.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        btnDownload.setForeground(new java.awt.Color(255, 255, 255));
        btnDownload.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDownload.setText("D O W N L O A D");
        btnDownload.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDownload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDownloadMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDownload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(btnDownload)
                .addContainerGap())
        );

        tblListaDeArquivos.setBackground(new java.awt.Color(0, 206, 149));
        tblListaDeArquivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Arquivo", "Tamanho"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblListaDeArquivos);

        jPanel3.setBackground(new java.awt.Color(0, 206, 149));

        btnAtualizar.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAtualizar.setText("Atualizar lista");
        btnAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtualizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAtualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        barra.setBackground(new java.awt.Color(0, 20, 10));
        barra.setForeground(new java.awt.Color(0, 206, 149));
        barra.setBorderPainted(false);
        barra.setStringPainted(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addGap(260, 260, 260))
            .addComponent(jScrollPane1)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(barra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void atualizar(){
        try {
            listaArquivos = new TorrentFilesManage().participar(Conexao.IP_TRACKER);
        } catch (IOException ex) {
            Logger.getLogger(TelaLista.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(TelaLista.class.getName()).log(Level.SEVERE, null, ex);
        }
        String url = "http://localhost:8080/Peer/webresources/peer/salvar/";
        new Conexao().conectaWebService(url, new Gson().toJson(listaArquivos), "POST");
        tfm.getTrackerList(Conexao.IP_TRACKER)
        	.forEach(arquivo -> fileMap.put(arquivo.getNome(), arquivo));

        tblListaDeArquivos.removeAll();
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Nome do Arquivo","Tamanho (kb)"});
        tblListaDeArquivos.setModel(model);

        fileMap.values().forEach (arquivo -> {
            for(int j = 0; j < Listas.LISTA_ARQUIVOS.size(); j++){
                if(arquivo.getHashArquivo().equals(Listas.LISTA_ARQUIVOS.get(j).getHashArquivo())){
                    break;
                }
                if(j == Listas.LISTA_ARQUIVOS.size() - 1 && 
                   !arquivo.getHashArquivo().equals(Listas.LISTA_ARQUIVOS.get(j).getHashArquivo())){
                    model.addRow(new Object[]{arquivo.getNome(),arquivo.getTamanhoArquivo()});
                }
            }
        });

        
    }
    
    private void btnAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtualizarMouseClicked
        atualizar();
    }//GEN-LAST:event_btnAtualizarMouseClicked

    public TelaLog telaLog = new TelaLog();
    private void btnDownloadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDownloadMouseClicked
        int linha = tblListaDeArquivos.getSelectedRow();
        String nomeArquivo = tblListaDeArquivos.getModel().getValueAt(linha, 0).toString();

        Arquivo arquivo = fileMap.get(nomeArquivo);
        
        //PREPARANDO PEERS PARA CONEXAO
        int    tamanho_vetor   = 200;//arquivo.getTamanhoVetor();
        int    numero_peers    = arquivo.getPeer().size();
        int[]  vetor_principal = new int[tamanho_vetor];
        int    tamanho_bloco   = (int) tamanho_vetor / (numero_peers * 5);
        
        int progress = 0;
        barra.setMinimum(0);
        barra.setMaximum(tamanho_vetor-1);
        barra.setValue(0);
        barra.setStringPainted(true);
        
        List<Thread> listaThreads = new ArrayList<>();
        
        List<PeerModelo> peers = getPeersList(arquivo);
        
        
        Arrays.fill(vetor_principal, 200);
        
        telaLog.logArea.append("fazendo download...\n");
        telaLog.logArea.append("Arquivo: " + arquivo.getNome());
        telaLog.logArea.append("Tamanho: " + arquivo.getTamanhoArquivo());
        
        for(int i = 0; i < vetor_principal.length; i++){
            if(vetor_principal[i] < -128 || vetor_principal[i] > 127){
                for(int j = 0; j < numero_peers; j++){
                    int jj = getPeerDisponivel(peers, j);
					int ii = i;
					i += tamanho_bloco;
					String hashArquivo = arquivo.getHashArquivo();
					listaThreads.add(new Thread(
							() -> runThread(peers, ii, jj, vetor_principal, tamanho_vetor, tamanho_bloco, hashArquivo)));
                }
                i--;
            }
            progress++;
            barra.setStringPainted(true);
            barra.setValue(progress);
            telaLog.logArea.append(barra.getString()+"\n");
        }
     
        
        //VERIFICANDO SE AS THREADS JA ENCERRARAM
        aguardaThreads(listaThreads);
        barra.setStringPainted(false);
        telaLog.logArea.append("download feito!\n");
        
        //SALVANDO ARQUIVO DO DOWNLOAD
        salvarArquivo(vetor_principal, arquivo);
        
        atualizar();
        
    }//GEN-LAST:event_btnDownloadMouseClicked

	private int getPeerDisponivel(List<PeerModelo> peers, int j) {
		while(!peers.get(j).getDisponibilidade()){
		    //System.out.println("peer off " + peers.get(l).getIp());
		    if(++j >= peers.size()){
		        //System.out.println("recomeça lista de peers...");
		        j = 0;
		    }
		}
		return j;
	}

	private void aguardaThreads(List<Thread> listaThreads) {
		int indice = listaThreads.size();
        while(indice > 0){
            for(int i = 0; i < listaThreads.size(); i++){
                if(!listaThreads.get(i).isAlive()){
                    listaThreads.remove(listaThreads.get(i));
                    indice--;
                    telaLog.logArea.append("Threads abertas: " + indice);
                    
                }
            }
        }
	}

	private List<PeerModelo> getPeersList(Arquivo arquivo) {
		List<PeerModelo> peers = new ArrayList<>();

        for(int i = 0; i < arquivo.getPeer().size(); i ++){
        	PeerModelo peer = new PeerModelo();
        	
            peer.setIp(arquivo.getPeer().get(i));
            peer.setDisponibilidade(true);
            peers.add(peer);
        }
		return peers;
	}

	public void runThread(List<PeerModelo> peers, int ii, int jj, int[] vetor_principal, int tamanho_vetor,
			int tamanho_bloco, String hashArquivo) {

        peers.get(jj).setDisponibilidade(false);
        int inicio_bloco = ii;
        telaLog.logArea.append("Peer escolhido " + peers.get(jj).getIp() + ": pacote " + inicio_bloco);
        ArquivoDownload arquivoDownload = new ArquivoDownload();
        String url = "http://"+peers.get(jj).getIp()+":8080/Peer/webresources/peer/download/"+tamanho_bloco+"/"+inicio_bloco+"/"+hashArquivo;
        try{
            String jsonDownload = new Conexao().conectaWebService(url, null, "GET");
            if(!jsonDownload.equals(null)){
                arquivoDownload = new Gson().fromJson(jsonDownload, ArquivoDownload.class);
                peers.get(jj).setDisponibilidade(true);

                byte[] vetor_menor = new byte[arquivoDownload.getVetor().length];
                vetor_menor = arquivoDownload.getVetor();
                String hash = new TorrentFilesManage().getHashCode(vetor_menor);
                if(hash.equals(arquivoDownload.getHash())){
                    telaLog.logArea.append("hash vetor ok: pacote " + inicio_bloco);
                    for(int k = 0; k < vetor_menor.length; k++){
                        if(inicio_bloco < tamanho_vetor){
                            vetor_principal[inicio_bloco] = vetor_menor[k];
                            inicio_bloco++;
                        }
                    }
                    //i += vetor_menor.length;
                }else{
                    System.out.println("not");
                    for(int k = 0; k < vetor_menor.length; k++){
                        if(inicio_bloco < tamanho_vetor){
                            vetor_principal[inicio_bloco] = -200;
                            inicio_bloco++;
                        }
                    }
                    //i = inicio_bloco;
                }
            }else{
                peers.get(jj).setDisponibilidade(false);
            }
        }catch(JsonSyntaxException | NoSuchAlgorithmException erro){
            System.out.println("Erro na thread: " + erro.getMessage());
        }

    }
	
	public void salvarArquivo(int[] vetor_principal, Arquivo arquivo) {

        byte[] vetor_final = new byte[vetor_principal.length];
        for(int i = 0; i < vetor_principal.length; i++){
            vetor_final[i] = (byte) vetor_principal[i];
        }
        telaLog.logArea.append("verificando...");
        try {
            if(new TorrentFilesManage().getHashCode(vetor_final).equals(arquivo.getHashArquivo())){
                new TorrentFilesManage().createFileFromByteArray("C://ThorEnt//" + arquivo.getNome(), vetor_final);
                System.out.println("ok");
                System.out.println("salvo!");
            }else{
                telaLog.logArea.append("Hash incorreto");
                telaLog.logArea.append("Hash esperado: " + arquivo.getHashArquivo());
                telaLog.logArea.append("Hash do arquivo baixado: " + new TorrentFilesManage().getHashCode(vetor_final));
            
            }
            //new TorrentFilesManage().createFileFromByteArray("C://ThorEnt//testando.jpg", vetor_final);
        } catch (Exception ex) {
        	
            telaLog.logArea.append("Salvar arquivo: " + ex.getMessage());
            Logger.getLogger(TelaLista.class.getName()).log(Level.SEVERE, null, ex);
        }
	}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JProgressBar barra;
    private javax.swing.JLabel btnAtualizar;
    private javax.swing.JLabel btnDownload;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListaDeArquivos;
    // End of variables declaration//GEN-END:variables
}
