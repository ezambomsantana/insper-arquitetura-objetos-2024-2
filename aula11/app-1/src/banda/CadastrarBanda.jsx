import { useState } from 'react'
import { Button, Grid, TextField } from '@mui/material';

function CadastrarBanda() {

  const [nome, setNome] = useState();
  const [pais, setPais] = useState();
  const [anoFormacao, setAnoFormacao] = useState();

  function click() {

    const data = {
      'nome':  nome,
      'pais': pais,
      'anoFormacao': anoFormacao
    }

    fetch('http://localhost:8080/api/v1/banda', {
      method: 'POST',
      body: JSON.stringify(data),
      headers: {
        'Content-Type': 'application/json'
      }
    }).then(response => {
      alert('Banda cadastrada com sucesso')
    }).catch(response => {
      alert('Erro no cadastro da banda')
    })

  }

  return (
    <>

    <Grid container spacing={2}>
      <Grid item xs={6}>
        <TextField
          label='Nome: '
          value={nome}
          onChange={e => setNome(e.target.value)}
        />
      </Grid>
      <Grid item xs={6}>
        <TextField
          label='País: '
          value={pais}
          onChange={e => setPais(e.target.value)}
        />
      </Grid>
      <Grid item xs={6}>
        <TextField
          label='Ano Formação: '
          valor={anoFormacao}
          onChange={e => setAnoFormacao(e.target.value)}
        />
      </Grid>
      <Grid item xs={12}>
        <Button 
          onClick={() => click()}
          variant="contained"
          color="success"
        >Cadastrar</Button>
        </Grid>

      </Grid>
    </>
  )
}

export default CadastrarBanda
