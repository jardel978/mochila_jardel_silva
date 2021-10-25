import React, { Component } from 'react';
import './Conversor.css';

export default class Conversor extends Component {

    constructor(props) {
        super(props); 

        this.state = {
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
        let de_para = `${this.props.moedaA}_${this.props.moedaB}`;
        let url = `https://free.currconv.com/api/v7/convert?q=${de_para}&compact=y&apiKey=07a2f7a26c279370fb4c`
        
        const json = await (await (fetch(url))).json();

        let cotacao = json[de_para].val;
        let moedaB_valor = (parseFloat(this.state.moedaA_valor) * cotacao).toFixed(2);
        this.setState({moedaB_valor});
    }

    render() {
        return (
            <div className="conversor">
               <h2>{this.props.moedaA} para {this.props.moedaB}</h2>
               <input type="text" onChange = {(event) => {this.setState({moedaA_valor: event.target.value})}} placeholder = {this.props.moedaA}></input>
               <input type="button" onClick = {this.converter} value="Converter"></input>
               <h2 className="resultado">{this.state.moedaB_valor}</h2>
            </div>
        )
    }
}
