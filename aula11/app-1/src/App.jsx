import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import CadastrarBanda from './banda/CadastrarBanda'
import ListarBanda from './banda/ListarBanda'

function App() {


  return (
    <>
      <CadastrarBanda></CadastrarBanda>
      <ListarBanda></ListarBanda>
      
    </>
  )
}

export default App
