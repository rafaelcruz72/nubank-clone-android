package com.nubank.nubankcloneui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.nubank.nubankcloneui.adapter.AdapterPagamento
import com.nubank.nubankcloneui.adapter.AdapterProduto
import com.nubank.nubankcloneui.databinding.ActivityMainBinding
import com.nubank.nubankcloneui.model.Pagamento
import com.nubank.nubankcloneui.model.Produto

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterPagamento: AdapterPagamento
    private val listaPagamento: MutableList<Pagamento> = mutableListOf()

    private lateinit var adapterProduto: AdapterProduto
    private val listaProduto: MutableList<Produto> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        val recyclerIconesPagamento = binding.recyclerIconesPagamento
        recyclerIconesPagamento.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.HORIZONTAL, false)
        recyclerIconesPagamento.setHasFixedSize(true)
        adapterPagamento = AdapterPagamento(this, listaPagamento)
        recyclerIconesPagamento.adapter = adapterPagamento
        listaIconesPagamento()

        val recyclerProdutos = binding.recyclerProdutos
        recyclerProdutos.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.HORIZONTAL, false)
        recyclerProdutos.setHasFixedSize(true)
        adapterProduto = AdapterProduto(this, listaProduto)
        recyclerProdutos.adapter = adapterProduto
        listaTextoInformativo()
    }

    private fun listaIconesPagamento(){
        val icone1 = Pagamento(R.drawable.ic_pix, "Área Pix")
        listaPagamento.add(icone1)

        val icone2 = Pagamento(R.drawable.barcode, "Pagar")
        listaPagamento.add(icone2)

        val icone3 = Pagamento(R.drawable.emprestimo, "Pegar \n Emprestado")
        listaPagamento.add(icone3)

        val icone4 = Pagamento(R.drawable.transferencia, "Transferir")
        listaPagamento.add(icone4)

        val icone5 = Pagamento(R.drawable.depositar, "Depositar")
        listaPagamento.add(icone5)

        val icone6 = Pagamento(R.drawable.ic_recarga_celular, "Recarga \n do celular")
        listaPagamento.add(icone6)

        val icone7 = Pagamento(R.drawable.ic_cobrar, "Cobrar")
        listaPagamento.add(icone7)

        val icone8 = Pagamento(R.drawable.doacao, "Doação")
        listaPagamento.add(icone8)

    }

    private fun listaTextoInformativo(){
        val textoInformativo1 = Produto("Participe da Promoção Tudo no Roxinho e concorra a...")
        listaProduto.add(textoInformativo1)

        val textoInformativo2 = Produto("Chegou o débito automático da fatura do cartão")
        listaProduto.add(textoInformativo2)

        val textoInformativo3 = Produto("Conheça a conta PJ: prática e livre de burocracia para se...")
        listaProduto.add(textoInformativo3)

        val textoInformativo4 = Produto("Salve seus amigos da burocracia: Faça um convite...")
        listaProduto.add(textoInformativo4)
    }
}