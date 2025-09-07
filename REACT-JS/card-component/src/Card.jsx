import photo from './assets/photo.png'

function Card() {
    return(
        <div className='card'>
            <img src= {photo} alt="profilePic" className='card-image' />
            <h2 className='card-title'>Manqasana Lepota</h2>
            <p className='card-text'>Software | Web Developer</p>

        </div>
    );
}
export default Card