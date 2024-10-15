import { useState } from 'react'

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
      Nome: <input type='text' id='nome' value={nome} onChange={e => setNome(e.target.value)}></input><br/>
      País: <input type='text' id='pais' value={pais} onChange={e => setPais(e.target.value)}></input><br/>
      Ano Formação: <input type='text' id='anoFormacao' value={anoFormacao} onChange={e => setAnoFormacao(e.target.value)}></input><br/> 
      <button onClick={() => click()}>Cadastrar</button>
    </>
  )
}

export default CadastrarBanda
