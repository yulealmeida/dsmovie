import { ReactComponent as Githubicon } from 'assets/img/github.svg';
import './styles.css';
function Navbar() {

    return (
        <header>
            <nav className="container">
                <div className='dsmovie-nav-content'>
                    <h1>DsMovie</h1>
                    <a href="https://github.com/yulealmeida">
                        <div className='dsmovie-contatic-container'>
                            <Githubicon>
                            </Githubicon>
                            <p className='dsmovie-contact-link'>/yulealmeida</p>
                        </div>


                    </a>
                </div>
            </nav>
        </header>
    );

}
export default Navbar;