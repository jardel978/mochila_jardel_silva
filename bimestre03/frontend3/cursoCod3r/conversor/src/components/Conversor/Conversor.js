import React, { Component } from 'react';
import './Conversor.css';

export default class Conversor extends Component {

    constructor(props) {
        super(props);

        this.state = {
            moedaA: "",
            moedaB: "",
            moedaA_valor: "",
            moedaB_valor: 0,
        }
        this.converter = this.converter.bind(this);
    }
    // converter(){
    //     let de_para = `${this.props.moedaA}_${this.props.moedaB}`;
    //     let url = `https://free.currconv.com/api/v7/convert?q=${de_para}&compact=ultra&apiKey=07a2f7a26c279370fb4c`

    //     fetch(url)
    //         .then(res =>{

    //             return res.json()
    //                 .then(json => {
    //                     let cotacao = json.USD_BRL;
    //                     let moedaB_valor = (parseFloat(this.state.moedaA_valor) * cotacao).toFixed(2);
    //                     this.setState({moedaB_valor});
    //                 })
    //         })
    // }

    converter = async () => {
        let de_para = `${this.state.moedaA}_${this.state.moedaB}`;
        let url = `https://free.currconv.com/api/v7/convert?q=${de_para}&compact=y&apiKey=07a2f7a26c279370fb4c`

        try {
            const json = await (await (fetch(url))).json();
            
            // console.log(url)
            let cotacao = json[de_para].val;
            let moedaB_valor = (parseFloat(this.state.moedaA_valor) * cotacao).toFixed(2);
            this.setState({ moedaB_valor });
        } catch (err) {
            alert("Um erro ocorreu: " + err.message + ". Pedimos desculpas e o quanto antes retornaremos operando normalmente!")
        }
    }

    capturarTipoA = (elemento) => {
        this.setState({
            moedaA: elemento
        });
        // console.log(elemento)
        // console.log(this.state.moedaA)
        // console.log(this.moedaB_valor)
    }
    capturarTipoB = (elemento) => {
        this.setState({
            moedaB: elemento
        });
        // console.log(elemento)
        // console.log(this.state.moedaB)
        // console.log(this.state.moedaB_valor)
    }

    render() {
        return (
            <div className="conversor">
                <p>Escolha abaixo <strong>DE</strong> que moeda deseja converter e <strong>PARA</strong> qual moeda deve ser convertida.</p>

                <div className="opcao">

                    <div className="dropdown">
                        <button className="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenu2" data-bs-toggle="dropdown" aria-expanded="false">
                            De: {this.state.moedaA}
                        </button>
                        <ul className="dropdown-menu dropdown-menu-dark" aria-labelledby="dropdownMenu2">
                            {this.props.moedas.map((item, key) => {
                                return (
                                    <li key={key} onClick={() => this.capturarTipoA(item.substr(0, 3))} className="dropdown-item" type="button">{item}</li>
                                )
                            })}
                        </ul>
                    </div>

                    <h2> para </h2>


                    <div className="dropdown">
                        <button className="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenu2" data-bs-toggle="dropdown" aria-expanded="false">
                            Para:  {this.state.moedaB}
                        </button>
                        <ul className="dropdown-menu dropdown-menu-dark" aria-labelledby="dropdownMenu2">
                            {this.props.moedas.map((item, key) => {
                                return (
                                    <li key={key} onClick={() => this.capturarTipoB(item.substr(0, 3))} className="dropdown-item" type="button">{item}</li>
                                )
                            })}
                        </ul>
                    </div>
                </div>

                <input type="text" onChange={(event) => { this.setState({ moedaA_valor: event.target.value.replace(",", ".") }) }} placeholder="100.00"></input>
                <input type="button" onClick={this.converter} value="Converter"></input>
                <h2 className="resultado">{isNaN(this.state.moedaB_valor) ? alert("Insira valores monetários válidos e não deixe campos vazios.") + this.setState({ moedaB_valor: 0 }) : this.state.moedaB_valor}</h2>
            </div>
        )
    }
}
