const atraso = () => new Promise(resolve => setTimeout(resolve, 1000));

const umPorSegundo = async () => {
    await atraso(console.log("1s"));
    await atraso(console.log("2s"));
    await atraso(console.log("3s"));

//esperando todos os retornos das promises usando o promise.all([])
    await Promise.all([atraso(console.log("1s")), atraso(console.log("2s")), atraso(console.log("3s"))]);
}

umPorSegundo();