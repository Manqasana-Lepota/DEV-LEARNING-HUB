function Food() {
    const fruit1 = "Orange";
    const fruit2 = "Banana";
    return(
        <ul>
            <li>Apple</li>
            <li>{fruit1}</li>
            <li>{fruit2.toUpperCase()}</li>
        </ul>
    );
}
export default Food