package ex.pdm.havagas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private EditText nomeCompleto;
    private EditText email;
    private CheckBox emailAtualizacao;
    private EditText telefone;
    private Spinner tipoTelefone;
    private CheckBox adcCelular;
    private EditText celular;
    private RadioGroup sexo;
    private RadioButton sexoM;
    private RadioButton sexoF;
    private EditText dtNascimento;
    private Spinner tipoFormacao;
    private EditText anoFormatura;
    private EditText anoConlusao;
    private EditText instituicao;
    private EditText tituloMonografia;
    private EditText orientador;
    private EditText vagas;
    private LinearLayout fundMedLayout;
    private LinearLayout gradEspecLayout;
    private LinearLayout mestDoutLayout;

    private ArrayList<String> tipoTelefoneList;
    private ArrayList<String> tipoFormacaoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();

        tipoTelefoneList = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.tipo_telefone)));
        ArrayAdapter<String> tipoTelefoneAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tipoTelefoneList);
        tipoTelefone.setAdapter(tipoTelefoneAdapter);

        tipoFormacaoList = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.tipo_formacao)));
        ArrayAdapter<String> tipoFormacaoAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tipoFormacaoList);
        tipoFormacao.setAdapter(tipoFormacaoAdapter);

        tipoFormacao.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if( (tipoFormacaoList.get(i).equals("Fundamental")) || (tipoFormacaoList.get(i).equals("Médio")) ){
                    fundMedLayout.setVisibility(View.VISIBLE);
                }
                else if ( (tipoFormacaoList.get(i).equals("Graduação")) || (tipoFormacaoList.get(i).equals("Especialização")) ){
                    gradEspecLayout.setVisibility(View.VISIBLE);
                }
                else if ( (tipoFormacaoList.get(i).equals("Mestrado")) || (tipoFormacaoList.get(i).equals("Doutorado")) ){
                    gradEspecLayout.setVisibility(View.VISIBLE);
                    mestDoutLayout.setVisibility(View.VISIBLE);
                }
                else{
                    fundMedLayout.setVisibility(View.GONE);
                    anoFormatura.setText("");

                    gradEspecLayout.setVisibility(View.GONE);
                    anoConlusao.setText("");
                    instituicao.setText("");

                    mestDoutLayout.setVisibility(View.GONE);
                    tituloMonografia.setText("");
                    orientador.setText("");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void onClick(View view){
        if(view.getId() == R.id.salvarBt){
            Enum<Sexo> sexo = null;
            Enum<tpTelefone> tpTel = null;
            boolean receberEmail = false;

            String nome = nomeCompleto.getText().toString();
            String tel = telefone.getText().toString();
            tpTel = (Enum<tpTelefone>) tipoTelefone.getOnItemSelectedListener();

            String em = email.getText().toString();
            if(emailAtualizacao.isChecked())
                receberEmail = true;

            String cel = null;
            if(adcCelular.isChecked()){
                celular.setVisibility(View.VISIBLE);
                 cel = celular.getText().toString();
            }
            else if(!adcCelular.isChecked()){
                celular.setVisibility(View.VISIBLE);
                celular.setText("");
            }

            if(sexoM.isChecked()) {
                sexo = Sexo.MASCULINO;
            }
            else if (sexoF.isChecked()){
                sexo = Sexo.FEMININO;
            }

            String dataNasc = dtNascimento.getText().toString();

            String anoForma = anoFormatura.getText().toString();
            String anoConc = anoConlusao.getText().toString();
            String nomeInstituicao = instituicao.getText().toString();
            String tituloMono = tituloMonografia.getText().toString();
            String orient = orientador.getText().toString();

            String vagaInteresse = vagas.getText().toString();

            Formulario formulario = new Formulario(nome, em, receberEmail, tel, tpTel , cel, sexo, dataNasc, anoForma, anoConc, nomeInstituicao, tituloMono, orient, vagaInteresse);
            Toast.makeText(this, formulario.toString(), Toast.LENGTH_SHORT).show();

        }
        else{
            if(view.getId() == R.id.limparBt){
                limparCampos();
            }
        }
    }

    public void limparCampos() {
        nomeCompleto.setText("");
        email.setText("");
        emailAtualizacao.setChecked(false);
        telefone.setText("");
        tipoTelefone.setSelection(0);
        adcCelular.setChecked(false);
        celular.setText("");
        sexoM.setChecked(true);
        sexoF.setChecked(false);
        dtNascimento.setText("");
        tipoFormacao.setSelection(0);
        anoFormatura.setText("");
        anoConlusao.setText("");
        instituicao.setText("");
        tituloMonografia.setText("");
        orientador.setText("");
        vagas.setText("");
    }


    public void bindViews(){
        nomeCompleto = findViewById(R.id.nomeCompletoEt);
        email = findViewById(R.id.emailEt);
        emailAtualizacao = findViewById(R.id.emailAtualizacaoCb);
        telefone = findViewById(R.id.telefoneEt);
        tipoTelefone = findViewById(R.id.tipoTelefoneSp);
        adcCelular = findViewById(R.id.adcCelularCb);
        celular = findViewById(R.id.celularEt);
        sexo = findViewById(R.id.sexoRg);
        sexoM = findViewById(R.id.masculinoRb);
        sexoF = findViewById(R.id.femininoRb);
        dtNascimento = findViewById(R.id.dtNascimentoEt);
        tipoFormacao = findViewById(R.id.tipoFormacaoSp);
        anoFormatura = findViewById(R.id.anoFormaturaEt);
        anoConlusao = findViewById(R.id.anoConclusaoEt);
        instituicao = findViewById(R.id.instituicaoEt);
        tituloMonografia = findViewById(R.id.tituloEt);
        orientador = findViewById(R.id.orientadorEt);
        vagas = findViewById(R.id.vagasEt);
        fundMedLayout = findViewById(R.id.fundMedLl);
        gradEspecLayout = findViewById(R.id.gradEspLl);
        mestDoutLayout = findViewById(R.id.mesDouLl);
    }
}