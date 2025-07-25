import React from 'react';
import styles from './Cart.module.css'
import './Cart.module.css'

export class Cart extends React.Component {
    render() {
        return (
            <div className={styles.CartTable}>
                <table className={styles.Table}>
                    <thead>
                        <tr>
                            <th>Name</th>
                            <th>Price</th>
                        </tr>
                    </thead>
                    <tbody>
                        {this.props.item.map((item)=>
                            <tr>
                                <td>{item.itemname}</td>
                                <td>{item.price}</td>
                            </tr>
                        )}
                    </tbody>
                </table>
            </div>
        );
    }
}